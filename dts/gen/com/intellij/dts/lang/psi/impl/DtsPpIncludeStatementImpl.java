// This is a generated file. Not intended for manual editing.
package com.intellij.dts.lang.psi.impl;

import static com.intellij.dts.lang.psi.DtsTypes.*;

public class DtsPpIncludeStatementImpl extends com.intellij.dts.lang.psi.mixin.PpIncludeStatementMixin implements com.intellij.dts.lang.psi.DtsPpIncludeStatement {

  public DtsPpIncludeStatementImpl(com.intellij.lang.ASTNode node) {
    super(node);
  }

  @java.lang.Override
  @org.jetbrains.annotations.Nullable
  public com.intellij.dts.lang.psi.DtsPpHeader getPpHeader() {
    return com.intellij.psi.util.PsiTreeUtil.getChildOfType(this, com.intellij.dts.lang.psi.DtsPpHeader.class);
  }

}