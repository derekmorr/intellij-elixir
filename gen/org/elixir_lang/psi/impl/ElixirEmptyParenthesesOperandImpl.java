// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.elixir_lang.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ElixirEmptyParenthesesOperandImpl extends ElixirEmptyParenthesesExpressionImpl implements ElixirEmptyParenthesesOperand {

  public ElixirEmptyParenthesesOperandImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) ((ElixirVisitor)visitor).visitEmptyParenthesesOperand(this);
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
  public ElixirMatchedExpression getMatchedExpression() {
    return findChildByClass(ElixirMatchedExpression.class);
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

  @NotNull
  public OtpErlangObject quote() {
    return ElixirPsiImplUtil.quote(this);
  }

}
