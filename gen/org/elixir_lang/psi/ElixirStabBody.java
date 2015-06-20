// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.ericsson.otp.erlang.OtpErlangObject;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface ElixirStabBody extends Quotable {

  @NotNull
  List<ElixirAtBlockOperation> getAtBlockOperationList();

  @NotNull
  List<ElixirBlockExpression> getBlockExpressionList();

  @NotNull
  List<ElixirCaptureBlockOperation> getCaptureBlockOperationList();

  @NotNull
  List<ElixirEmptyParentheses> getEmptyParenthesesList();

  @NotNull
  List<ElixirEmptyParenthesesExpression> getEmptyParenthesesExpressionList();

  @NotNull
  List<ElixirEndOfExpression> getEndOfExpressionList();

  @NotNull
  List<ElixirMatchedExpression> getMatchedExpressionList();

  @NotNull
  List<ElixirUnaryBlockOperation> getUnaryBlockOperationList();

  @NotNull
  List<ElixirUnqualifiedNoParenthesesManyArgumentsCall> getUnqualifiedNoParenthesesManyArgumentsCallList();

  @NotNull
  OtpErlangObject quote();

}
