// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.ericsson.otp.erlang.OtpErlangObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ElixirStabParenthesesSignature extends Quotable {

  @Nullable
  ElixirAtBlockOperation getAtBlockOperation();

  @Nullable
  ElixirBlockExpression getBlockExpression();

  @Nullable
  ElixirCaptureBlockOperation getCaptureBlockOperation();

  @Nullable
  ElixirEmptyParentheses getEmptyParentheses();

  @Nullable
  ElixirEmptyParenthesesExpression getEmptyParenthesesExpression();

  @Nullable
  ElixirMatchedExpression getMatchedExpression();

  @NotNull
  ElixirParenthesesArguments getParenthesesArguments();

  @Nullable
  ElixirUnaryBlockOperation getUnaryBlockOperation();

  @Nullable
  ElixirUnqualifiedNoParenthesesManyArgumentsCall getUnqualifiedNoParenthesesManyArgumentsCall();

  @Nullable
  ElixirWhenInfixOperator getWhenInfixOperator();

  @NotNull
  OtpErlangObject quote();

}
