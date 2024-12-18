# Metadata generation

Metadata for Terraform is collected and stored in the jar-file and then bundled into plugin to provide completion and validation

For collecting the metadata, the [TerraformProvidersMetadataBuilder](ls-schemas-extractor/src/TerraformProvidersMetadataBuilder.kt) is used.
Please note that parsing heavy JSON files requires a lot of memory, so we recommend allocating 4GB memory for running the crawler.

## Using Docker to collect metadata and publish a jar file

1. Set up Docker on the local computer
2. Generate Docker image `./gradlew clean buildDockerImage`
3. Push the image to a Docker registry of your choice using the command: `docker push intellij.terraform/metadata-crawler:<IMAGE_VERSION>` (optional)
4. Run the image: `docker run -m 4096m -d intellij.terraform/metadata-crawler:<IMAGE_VERSION> publish`
5. The application will collect metadata, build artifact and push it to the repository according to default settings. If we need to alter defaults, we need to redefine environment variables (see the table below).

For the image, we can specify the following environment configuration parameters

| Variable Name                | Default Value                                                    | Comment                                                                                                                                       |
|------------------------------|------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------|
| TERRAFORM_REGISTRY_HOST      | https://registry.terraform.io                                    |                                                                                                                                               |
| DOWNLOADS_LIMIT_FOR_PROVIDER | 10000                                                            | Minimum downloads numbers for provider to include it into metadata                                                                            |
| CLEAN_DOWNLOADED_DATA        | true                                                             | Whether or not clean data downloaded from terraform registry after processing. If set to "true", the script will download data on every start |
| ARTIFACT_GROUP               | org.intellij.plugins.hcl.terraform                               | Maven coordinates for the metadata jar                                                                                                        |
| ARTIFACT_VERSION             | 2024.1.2                                                         | Metadata version                                                                                                                              |
| REPO_URL                     | https://packages.jetbrains.team/maven/p/ij/intellij-dependencies | Maven repository URL                                                                                                                          |
| REPO_USERNAME                | spaceUsername                                                    | Maven repository username                                                                                                                     |
| REPO_PASSWORD                | spacePassword                                                    | Maven repository password                                                                                                                     |

For example, if we want to change an artifact version, we can specify it in the command line:
`docker run -d -e ARTIFACT_VERSION=2024.2.0  intellij.terraform/metadata-crawler:<IMAGE_VERSION> publish`

### How to build artifact only
1. If we don't want to publish metadata, we can bind a local folder to a container folder and get the metadata jar file: `docker run -m 4096m -d -v <LOCAL_FOLDER>:/opt/terraform-metadata/build/libs intellij.terraform/metadata-crawler:<IMAGE_VERSION> jar`
2. After execution finished, we can publish the jar manually.

### Container folders of interest
The following folders can be mounted for better diagnostics:
1. `/opt/terraform-metadata/plugins-meta` stores the extracted schemas metadata files as well as error logs.
2. `/opt/terraform-metadata/build/libs` stores the generated metadata jar file.