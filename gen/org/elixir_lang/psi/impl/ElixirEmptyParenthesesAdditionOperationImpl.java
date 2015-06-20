// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.elixir_lang.psi.*;
import org.jetbrains.annotations.NotNull;

public class ElixirEmptyParenthesesAdditionOperationImpl extends ElixirEmptyParenthesesExpressionImpl implements ElixirEmptyParenthesesAdditionOperation {

  public ElixirEmptyParenthesesAdditionOperationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) ((ElixirVisitor)visitor).visitEmptyParenthesesAdditionOperation(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ElixirAdditionInfixOperator getAdditionInfixOperator() {
    return findNotNullChildByClass(ElixirAdditionInfixOperator.class);
  }

  @Override
  @NotNull
  public ElixirEmptyParentheses getEmptyParentheses() {
    return findNotNullChildByClass(ElixirEmptyParentheses.class);
  }

  @Override
  @NotNull
  public ElixirEmptyParenthesesExpression getEmptyParenthesesExpression() {
    return findNotNullChildByClass(ElixirEmptyParenthesesExpression.class);
  }

  @NotNull
  public OtpErlangObject quote() {
    return ElixirPsiImplUtil.quote(this);
  }

}
