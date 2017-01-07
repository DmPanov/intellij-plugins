package name.kropp.intellij.makefile

import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.util.ProcessingContext
import name.kropp.intellij.makefile.psi.MakefileTypes

class MakefileCompletionContributor : CompletionContributor() {
  private val keywords = listOf("include", "define", "undefine", "override", "export", "private", "vpath")
  init {
    extend(CompletionType.BASIC, PlatformPatterns.psiElement(MakefileTypes.IDENTIFIER).withParent(MakefileFile::class.java),
        object : CompletionProvider<CompletionParameters>() {
      override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext?, resultSet: CompletionResultSet) {
        resultSet.addAllElements(keywords.map { LookupElementBuilder.create(it) })
      }
    })
  }
}