// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.elixir_lang.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ElixirBlockExpressionImpl extends ASTWrapperPsiElement implements ElixirBlockExpression {

  public ElixirBlockExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) ((ElixirVisitor)visitor).visitBlockExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ElixirBlockNoParenthesesCall getBlockNoParenthesesCall() {
    return findChildByClass(ElixirBlockNoParenthesesCall.class);
  }

  @Override
  @NotNull
  public ElixirDoBlock getDoBlock() {
    return findNotNullChildByClass(ElixirDoBlock.class);
  }

  @Override
  @Nullable
  public ElixirMatchedExpression getMatchedExpression() {
    return findChildByClass(ElixirMatchedExpression.class);
  }

  @NotNull
  public OtpErlangObject quote() {
    return ElixirPsiImplUtil.quote(this);
  }

}
