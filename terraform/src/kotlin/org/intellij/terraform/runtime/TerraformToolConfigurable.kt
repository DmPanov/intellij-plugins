// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package org.intellij.terraform.runtime

import com.intellij.openapi.fileChooser.FileChooserDescriptor
import com.intellij.openapi.options.BoundConfigurable
import com.intellij.openapi.options.SearchableConfigurable
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogPanel
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.openapi.ui.emptyText
import com.intellij.ui.dsl.builder.AlignX
import com.intellij.ui.dsl.builder.Cell
import com.intellij.ui.dsl.builder.bindText
import com.intellij.ui.dsl.builder.panel
import org.intellij.terraform.hcl.HCLBundle

private const val CONFIGURABLE_ID: String = "reference.settingsdialog.project.terraform"

class TerraformToolConfigurable(private val project: Project) : BoundConfigurable(
  HCLBundle.message("terraform.name"), null
), SearchableConfigurable {

  private val configuration = TerraformProjectSettings.getInstance(project)
  private lateinit var executorPathField: Cell<TextFieldWithBrowseButton>

  override fun getId(): String = CONFIGURABLE_ID

  override fun createPanel(): DialogPanel {
    val fileChooserDescriptor = FileChooserDescriptor(true, false, false, false, false, false)

    return panel {
      row(HCLBundle.message("terraform.settings.executable.path.label")) {
        executorPathField = textFieldWithBrowseButton(
          browseDialogTitle = "",
          fileChooserDescriptor = fileChooserDescriptor,
          fileChosen = { chosenFile ->
            return@textFieldWithBrowseButton chosenFile.path
          }
        ).bindText(configuration::terraformPath).applyToComponent {
          emptyText.text = TerraformProjectSettings.getDefaultTerraformPath()
        }.align(AlignX.FILL)
      }
    }
  }

  override fun isModified(): Boolean {
    return executorPathField.component.text.trim() != configuration.terraformPath
  }
}