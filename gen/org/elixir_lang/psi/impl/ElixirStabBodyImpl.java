// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.elixir_lang.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ElixirStabBodyImpl extends ASTWrapperPsiElement implements ElixirStabBody {

  public ElixirStabBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) ((ElixirVisitor)visitor).visitStabBody(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ElixirAtBlockOperation> getAtBlockOperationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirAtBlockOperation.class);
  }

  @Override
  @NotNull
  public List<ElixirBlockExpression> getBlockExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirBlockExpression.class);
  }

  @Override
  @NotNull
  public List<ElixirCaptureBlockOperation> getCaptureBlockOperationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirCaptureBlockOperation.class);
  }

  @Override
  @NotNull
  public List<ElixirEmptyParentheses> getEmptyParenthesesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirEmptyParentheses.class);
  }

  @Override
  @NotNull
  public List<ElixirEmptyParenthesesExpression> getEmptyParenthesesExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirEmptyParenthesesExpression.class);
  }

  @Override
  @NotNull
  public List<ElixirEndOfExpression> getEndOfExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirEndOfExpression.class);
  }

  @Override
  @NotNull
  public List<ElixirMatchedExpression> getMatchedExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirMatchedExpression.class);
  }

  @Override
  @NotNull
  public List<ElixirUnaryBlockOperation> getUnaryBlockOperationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirUnaryBlockOperation.class);
  }

  @Override
  @NotNull
  public List<ElixirUnqualifiedNoParenthesesManyArgumentsCall> getUnqualifiedNoParenthesesManyArgumentsCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirUnqualifiedNoParenthesesManyArgumentsCall.class);
  }

  @NotNull
  public OtpErlangObject quote() {
    return ElixirPsiImplUtil.quote(this);
  }

}
