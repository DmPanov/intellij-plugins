import com.bertramlabs.plugins.hcl4j.HCLParser
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.databind.node.ObjectNode
import java.io.File
import java.net.URI
import java.net.URLDecoder
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.util.concurrent.atomic.AtomicInteger

object TerraformProvidersMetadataBuilder {

  private val objectMapper: ObjectMapper = ObjectMapper()

  private val httpClient: HttpClient = HttpClient.newBuilder().build()

  private val terraformRegistryHost = System.getenv("TERRAFORM_REGISTRY_HOST") ?: "https://registry.terraform.io"
  private val downloadsLimitForProvider = System.getenv("DOWNLOADS_LIMIT_FOR_PROVIDER")?.toInt() ?: 10000
  private val cleanDownloadedData = System.getenv("CLEAN_DOWNLOADED_DATA")?.toBoolean() ?: true

  private fun getQuery(httpQuery: String): HttpResponse<String> {
    val httpRequest =
      HttpRequest.newBuilder().uri(
        URI(httpQuery)
      ).GET().build()
    return httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString())
  }

  private fun String.urlDecode(): String = URLDecoder.decode(this, StandardCharsets.UTF_8)

  private fun getProvidersDataFromPages(): Sequence<JsonNode> {
    println("Loading providers from $terraformRegistryHost ...")
    return sequence {
      var httpResponse = getQuery("${terraformRegistryHost}/v2/providers")
      while (true) {
        val jsonResponse = objectMapper.readTree(httpResponse.body())
        val page = jsonResponse.get("meta")?.get("pagination")?.get("current-page")
        val pageTotal = jsonResponse.get("meta")?.get("pagination")?.get("total-pages")
        println("Loaded page ${page} of ${pageTotal}  ...")
        val next = jsonResponse.get("links")?.get("next")?.takeIf { !it.isNull }?.asText()?.urlDecode()
        when (val responseData = jsonResponse["data"]) {
          is ObjectNode -> yield(responseData)
          is ArrayNode -> yieldAll(responseData.elements())
        }
        if (next == null) break
        httpResponse = getQuery("${terraformRegistryHost}${next}")
      }
    }
  }

  @JvmStatic
  fun main(args: Array<String>) {
    val outputDir = File("plugins-meta").apply { mkdirs() }
    val allOut = File(outputDir, "allout.json")
    if (!allOut.exists()) {
      objectMapper.writerWithDefaultPrettyPrinter().writeValue(allOut, getProvidersDataFromPages().asIterable())
    }
    println("Providers from $terraformRegistryHost are loaded to ${allOut}")
    val buildInProvider = objectMapper.nodeFactory.let { nf ->
      nf.objectNode().set<JsonNode>("attributes",
                                    nf.objectNode()
                                      .put("full-name", "terraform.io/builtin/terraform")
                                      .put("name", "terraform")
                                      .put("namespace", "terraform")
                                      .put("tier", "builtin"))
    }
    val providerVendorsTier = setOf("partner", "official")
    val mostUsefulProviders = sequenceOf<JsonNode>(buildInProvider) +
                              objectMapper.readTree(allOut).elements().asSequence()
                                .filter { providerData ->
                                  val attributes = providerData["attributes"]
                                  val unlisted = attributes["unlisted"].asBoolean()
                                  !unlisted && (providerVendorsTier.contains(attributes["tier"].asText())
                                                || attributes["downloads"].asLong() >= downloadsLimitForProvider)
                                }
    val version = getTerraformVersion()
    println("Terraform version: $version")

    val generatedJsonFileNames = mutableListOf<String>()
    val totalProviders = AtomicInteger(0)
    val errors = AtomicInteger(0)
    mostUsefulProviders.forEach { data ->
      totalProviders.incrementAndGet()
      val name = data["attributes"]["full-name"].asText()
      println("Processing: $name")
      val file = buildProviderMetadata(data, version, outputDir)
      if (file.exists()) {
        println("Schema file generated: ${file.path}")
        generatedJsonFileNames.add(name)
      }
      else {
        println("Error generating schema for provider: ${name}")
        errors.incrementAndGet()
      }
    }
    File(File(outputDir, "resources/model").apply { mkdirs() }, "providers.list").writeText(generatedJsonFileNames.sorted().joinToString("\n"))
    if (cleanDownloadedData) {
      println("Deleting data about providers from file: ${allOut}")
      allOut.delete()
    }
    println("Providing processing finished, processed ${totalProviders} providers, errors: ${errors}")
  }

  private fun buildProviderMetadata(data: JsonNode,
                                    version: String,
                                    outputDir: File): File {
    val name = data["attributes"]["full-name"].asText()
    println("Provider: $name")
    val dir = name.substringBeforeLast("/")
    val file = name.substringAfterLast("/")


    val tfgendir = File("terraform-gen-dir/${dir}").apply { mkdirs() }

    writeVersionsTfFile(tfgendir, version, name)

    val logFile = File(File(outputDir, "logs/$dir").apply { mkdirs() }, "$file.log")
    val schemaFile = File(File(outputDir, "resources/model/providers/$dir").apply { mkdirs() }, "$file.json")

    val initError = initTerraform(tfgendir, logFile)
    val schemaError: String = generateTerraformSchema(tfgendir, schemaFile)

    if (schemaFile.length() <= 0L) {
      schemaFile.delete()
      val failures = File(outputDir, "failed/$dir")
      val failureDir = File(failures, file).apply { deleteRecursively() }.also { it.mkdirs() }
      File(tfgendir, "versions.tf").copyTo(File(failureDir, "versions.tf"))
      File(failureDir, "init.err").writeText(initError)
      File(failureDir, "schema.err").writeText(schemaError)
    }
    else {
      storeRegistryData(data, tfgendir, outputDir, dir, file)
    }
    deleteDirRecursively(tfgendir)
    return schemaFile
  }

  private fun storeRegistryData(data: JsonNode, tfgendir: File, outputDir: File, dir: String, file: String) {
    val lockFile = File(tfgendir, ".terraform.lock.hcl")
    if (lockFile.exists()) {
      val lockData = HCLParser().parse(lockFile)
      val providerMap = lockData["provider"] as? Map<*, *>
      val firstValue = providerMap?.values?.firstOrNull() as? Map<*, *>
      val version = firstValue?.get("version")
      version?.let {
        (data["attributes"] as? ObjectNode)?.put("version", it.toString())
      }
    }
    val metadataFile = File(File(outputDir, "resources/model/providers/$dir").apply { mkdirs() }, "$file.json.metadata")
    data.toString().byteInputStream().use { inputStream ->
      metadataFile.outputStream().use { outputStream ->
        inputStream.copyTo(outputStream)
      }
    }
  }

  private fun getTerraformVersion(): String = ProcessBuilder(listOf("terraform", "-v", "--json"))
    .redirectError(ProcessBuilder.Redirect.INHERIT)
    .start().let { versionProcess ->
      versionProcess.inputStream.use { objectMapper.readTree(it) }["terraform_version"].asText().also {
        versionProcess.waitFor()
      }
    }

  private fun deleteDirRecursively(tfgendir: File) {
    if (tfgendir.exists())
      Files.walk(tfgendir.toPath())
        .sorted(Comparator.reverseOrder())
        .map { it.toFile() }
        .forEach(File::delete)
  }

  private fun writeVersionsTfFile(tfgendir: File, version: String?, fullName: String?) {
    File(tfgendir, "versions.tf").writeText("""
        terraform {
          required_version = "$version"
          required_providers {
            googleworkspace = {
              source = "$fullName"
            }
          }
        }
      """.trimIndent())
  }

  private fun generateTerraformSchema(tfgendir: File, schemaFile: File): String {
    val schemaProcess = ProcessBuilder(listOf("terraform", "providers", "schema", "-json")).directory(tfgendir).start()
    schemaFile.outputStream().buffered().use { out ->
      schemaProcess.inputStream.use { input -> input.transferTo(out) }
    }
    val schemaError: String = schemaProcess.errorStream.use { it.reader().readText() }
    schemaProcess.waitFor()
    return schemaError
  }

  private fun initTerraform(tfgendir: File, logFile: File): String {
    val initError: String
    ProcessBuilder(listOf("terraform", "init")).directory(tfgendir)
      .redirectOutput(logFile)
      .start().also {
        it.errorStream.use { error -> initError = error.reader().readText() }
      }
      .waitFor()
    return initError
  }

}