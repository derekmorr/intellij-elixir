// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.ericsson.otp.erlang.OtpErlangObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface ElixirList extends Quotable {

  @NotNull
  List<ElixirEmptyParentheses> getEmptyParenthesesList();

  @Nullable
  ElixirKeywords getKeywords();

  @NotNull
  List<ElixirMatchedExpression> getMatchedExpressionList();

  @NotNull
  OtpErlangObject quote();

}
