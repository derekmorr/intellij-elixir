// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.elixir_lang.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ElixirStabParenthesesSignatureImpl extends ASTWrapperPsiElement implements ElixirStabParenthesesSignature {

  public ElixirStabParenthesesSignatureImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) ((ElixirVisitor)visitor).visitStabParenthesesSignature(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ElixirAtBlockOperation getAtBlockOperation() {
    return findChildByClass(ElixirAtBlockOperation.class);
  }

  @Override
  @Nullable
  public ElixirBlockExpression getBlockExpression() {
    return findChildByClass(ElixirBlockExpression.class);
  }

  @Override
  @Nullable
  public ElixirCaptureBlockOperation getCaptureBlockOperation() {
    return findChildByClass(ElixirCaptureBlockOperation.class);
  }

  @Override
  @Nullable
  public ElixirEmptyParentheses getEmptyParentheses() {
    return findChildByClass(ElixirEmptyParentheses.class);
  }

  @Override
  @Nullable
  public ElixirEmptyParenthesesExpression getEmptyParenthesesExpression() {
    return findChildByClass(ElixirEmptyParenthesesExpression.class);
  }

  @Override
  @Nullable
  public ElixirMatchedExpression getMatchedExpression() {
    return findChildByClass(ElixirMatchedExpression.class);
  }

  @Override
  @NotNull
  public ElixirParenthesesArguments getParenthesesArguments() {
    return findNotNullChildByClass(ElixirParenthesesArguments.class);
  }

  @Override
  @Nullable
  public ElixirUnaryBlockOperation getUnaryBlockOperation() {
    return findChildByClass(ElixirUnaryBlockOperation.class);
  }

  @Override
  @Nullable
  public ElixirUnqualifiedNoParenthesesManyArgumentsCall getUnqualifiedNoParenthesesManyArgumentsCall() {
    return findChildByClass(ElixirUnqualifiedNoParenthesesManyArgumentsCall.class);
  }

  @Override
  @Nullable
  public ElixirWhenInfixOperator getWhenInfixOperator() {
    return findChildByClass(ElixirWhenInfixOperator.class);
  }

  @NotNull
  public OtpErlangObject quote() {
    return ElixirPsiImplUtil.quote(this);
  }

}
