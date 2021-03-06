// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import org.elixir_lang.psi.impl.*;

public interface ElixirTypes {

  IElementType ACCESS_EXPRESSION = new ElixirElementType("ACCESS_EXPRESSION");
  IElementType ADDITION_INFIX_OPERATOR = new ElixirElementType("ADDITION_INFIX_OPERATOR");
  IElementType ADJACENT_EXPRESSION = new ElixirElementType("ADJACENT_EXPRESSION");
  IElementType ALIAS = new ElixirElementType("ALIAS");
  IElementType AND_INFIX_OPERATOR = new ElixirElementType("AND_INFIX_OPERATOR");
  IElementType ANONYMOUS_FUNCTION = new ElixirElementType("ANONYMOUS_FUNCTION");
  IElementType ARROW_INFIX_OPERATOR = new ElixirElementType("ARROW_INFIX_OPERATOR");
  IElementType ASSOCIATIONS = new ElixirElementType("ASSOCIATIONS");
  IElementType ASSOCIATIONS_BASE = new ElixirElementType("ASSOCIATIONS_BASE");
  IElementType ATOM = new ElixirElementType("ATOM");
  IElementType ATOM_KEYWORD = new ElixirElementType("ATOM_KEYWORD");
  IElementType AT_BLOCK_OPERATION = new ElixirElementType("AT_BLOCK_OPERATION");
  IElementType AT_NUMERIC_OPERATION = new ElixirElementType("AT_NUMERIC_OPERATION");
  IElementType AT_PREFIX_OPERATOR = new ElixirElementType("AT_PREFIX_OPERATOR");
  IElementType BINARY_DIGITS = new ElixirElementType("BINARY_DIGITS");
  IElementType BINARY_WHOLE_NUMBER = new ElixirElementType("BINARY_WHOLE_NUMBER");
  IElementType BIT_STRING = new ElixirElementType("BIT_STRING");
  IElementType BLOCK_EXPRESSION = new ElixirElementType("BLOCK_EXPRESSION");
  IElementType BLOCK_IDENTIFIER = new ElixirElementType("BLOCK_IDENTIFIER");
  IElementType BLOCK_ITEM = new ElixirElementType("BLOCK_ITEM");
  IElementType BLOCK_LIST = new ElixirElementType("BLOCK_LIST");
  IElementType BLOCK_NO_PARENTHESES_CALL = new ElixirElementType("BLOCK_NO_PARENTHESES_CALL");
  IElementType BRACKET_ARGUMENTS = new ElixirElementType("BRACKET_ARGUMENTS");
  IElementType CAPTURE_BLOCK_OPERATION = new ElixirElementType("CAPTURE_BLOCK_OPERATION");
  IElementType CAPTURE_EXPRESSION_OPERATION = new ElixirElementType("CAPTURE_EXPRESSION_OPERATION");
  IElementType CAPTURE_NUMERIC_OPERATION = new ElixirElementType("CAPTURE_NUMERIC_OPERATION");
  IElementType CAPTURE_PREFIX_OPERATOR = new ElixirElementType("CAPTURE_PREFIX_OPERATOR");
  IElementType CHAR_LIST_HEREDOC = new ElixirElementType("CHAR_LIST_HEREDOC");
  IElementType CHAR_LIST_HEREDOC_LINE = new ElixirElementType("CHAR_LIST_HEREDOC_LINE");
  IElementType CHAR_LIST_LINE = new ElixirElementType("CHAR_LIST_LINE");
  IElementType CHAR_TOKEN = new ElixirElementType("CHAR_TOKEN");
  IElementType COMPARISON_INFIX_OPERATOR = new ElixirElementType("COMPARISON_INFIX_OPERATOR");
  IElementType CONTAINER_ASSOCIATION_OPERATION = new ElixirElementType("CONTAINER_ASSOCIATION_OPERATION");
  IElementType DECIMAL_DIGITS = new ElixirElementType("DECIMAL_DIGITS");
  IElementType DECIMAL_FLOAT = new ElixirElementType("DECIMAL_FLOAT");
  IElementType DECIMAL_FLOAT_EXPONENT = new ElixirElementType("DECIMAL_FLOAT_EXPONENT");
  IElementType DECIMAL_FLOAT_EXPONENT_SIGN = new ElixirElementType("DECIMAL_FLOAT_EXPONENT_SIGN");
  IElementType DECIMAL_FLOAT_FRACTIONAL = new ElixirElementType("DECIMAL_FLOAT_FRACTIONAL");
  IElementType DECIMAL_FLOAT_INTEGRAL = new ElixirElementType("DECIMAL_FLOAT_INTEGRAL");
  IElementType DECIMAL_WHOLE_NUMBER = new ElixirElementType("DECIMAL_WHOLE_NUMBER");
  IElementType DOT_INFIX_OPERATOR = new ElixirElementType("DOT_INFIX_OPERATOR");
  IElementType DO_BLOCK = new ElixirElementType("DO_BLOCK");
  IElementType EMPTY_PARENTHESES = new ElixirElementType("EMPTY_PARENTHESES");
  IElementType ENCLOSED_HEXADECIMAL_ESCAPE_SEQUENCE = new ElixirElementType("ENCLOSED_HEXADECIMAL_ESCAPE_SEQUENCE");
  IElementType END_OF_EXPRESSION = new ElixirElementType("END_OF_EXPRESSION");
  IElementType ESCAPED_CHARACTER = new ElixirElementType("ESCAPED_CHARACTER");
  IElementType ESCAPED_EOL = new ElixirElementType("ESCAPED_EOL");
  IElementType HAT_INFIX_OPERATOR = new ElixirElementType("HAT_INFIX_OPERATOR");
  IElementType HEREDOC_LINE_PREFIX = new ElixirElementType("HEREDOC_LINE_PREFIX");
  IElementType HEREDOC_PREFIX = new ElixirElementType("HEREDOC_PREFIX");
  IElementType HEXADECIMAL_DIGITS = new ElixirElementType("HEXADECIMAL_DIGITS");
  IElementType HEXADECIMAL_ESCAPE_PREFIX = new ElixirElementType("HEXADECIMAL_ESCAPE_PREFIX");
  IElementType HEXADECIMAL_WHOLE_NUMBER = new ElixirElementType("HEXADECIMAL_WHOLE_NUMBER");
  IElementType INTERPOLATED_CHAR_LIST_BODY = new ElixirElementType("INTERPOLATED_CHAR_LIST_BODY");
  IElementType INTERPOLATED_CHAR_LIST_HEREDOC_LINE = new ElixirElementType("INTERPOLATED_CHAR_LIST_HEREDOC_LINE");
  IElementType INTERPOLATED_CHAR_LIST_SIGIL_HEREDOC = new ElixirElementType("INTERPOLATED_CHAR_LIST_SIGIL_HEREDOC");
  IElementType INTERPOLATED_CHAR_LIST_SIGIL_LINE = new ElixirElementType("INTERPOLATED_CHAR_LIST_SIGIL_LINE");
  IElementType INTERPOLATED_REGEX_BODY = new ElixirElementType("INTERPOLATED_REGEX_BODY");
  IElementType INTERPOLATED_REGEX_HEREDOC = new ElixirElementType("INTERPOLATED_REGEX_HEREDOC");
  IElementType INTERPOLATED_REGEX_HEREDOC_LINE = new ElixirElementType("INTERPOLATED_REGEX_HEREDOC_LINE");
  IElementType INTERPOLATED_REGEX_LINE = new ElixirElementType("INTERPOLATED_REGEX_LINE");
  IElementType INTERPOLATED_SIGIL_BODY = new ElixirElementType("INTERPOLATED_SIGIL_BODY");
  IElementType INTERPOLATED_SIGIL_HEREDOC = new ElixirElementType("INTERPOLATED_SIGIL_HEREDOC");
  IElementType INTERPOLATED_SIGIL_HEREDOC_LINE = new ElixirElementType("INTERPOLATED_SIGIL_HEREDOC_LINE");
  IElementType INTERPOLATED_SIGIL_LINE = new ElixirElementType("INTERPOLATED_SIGIL_LINE");
  IElementType INTERPOLATED_STRING_BODY = new ElixirElementType("INTERPOLATED_STRING_BODY");
  IElementType INTERPOLATED_STRING_HEREDOC_LINE = new ElixirElementType("INTERPOLATED_STRING_HEREDOC_LINE");
  IElementType INTERPOLATED_STRING_SIGIL_HEREDOC = new ElixirElementType("INTERPOLATED_STRING_SIGIL_HEREDOC");
  IElementType INTERPOLATED_STRING_SIGIL_LINE = new ElixirElementType("INTERPOLATED_STRING_SIGIL_LINE");
  IElementType INTERPOLATED_WORDS_BODY = new ElixirElementType("INTERPOLATED_WORDS_BODY");
  IElementType INTERPOLATED_WORDS_HEREDOC = new ElixirElementType("INTERPOLATED_WORDS_HEREDOC");
  IElementType INTERPOLATED_WORDS_HEREDOC_LINE = new ElixirElementType("INTERPOLATED_WORDS_HEREDOC_LINE");
  IElementType INTERPOLATED_WORDS_LINE = new ElixirElementType("INTERPOLATED_WORDS_LINE");
  IElementType INTERPOLATION = new ElixirElementType("INTERPOLATION");
  IElementType IN_INFIX_OPERATOR = new ElixirElementType("IN_INFIX_OPERATOR");
  IElementType IN_MATCH_INFIX_OPERATOR = new ElixirElementType("IN_MATCH_INFIX_OPERATOR");
  IElementType KEYWORDS = new ElixirElementType("KEYWORDS");
  IElementType KEYWORD_KEY = new ElixirElementType("KEYWORD_KEY");
  IElementType KEYWORD_PAIR = new ElixirElementType("KEYWORD_PAIR");
  IElementType LIST = new ElixirElementType("LIST");
  IElementType LITERAL_CHAR_LIST_BODY = new ElixirElementType("LITERAL_CHAR_LIST_BODY");
  IElementType LITERAL_CHAR_LIST_HEREDOC_LINE = new ElixirElementType("LITERAL_CHAR_LIST_HEREDOC_LINE");
  IElementType LITERAL_CHAR_LIST_SIGIL_HEREDOC = new ElixirElementType("LITERAL_CHAR_LIST_SIGIL_HEREDOC");
  IElementType LITERAL_CHAR_LIST_SIGIL_LINE = new ElixirElementType("LITERAL_CHAR_LIST_SIGIL_LINE");
  IElementType LITERAL_REGEX_BODY = new ElixirElementType("LITERAL_REGEX_BODY");
  IElementType LITERAL_REGEX_HEREDOC = new ElixirElementType("LITERAL_REGEX_HEREDOC");
  IElementType LITERAL_REGEX_HEREDOC_LINE = new ElixirElementType("LITERAL_REGEX_HEREDOC_LINE");
  IElementType LITERAL_REGEX_LINE = new ElixirElementType("LITERAL_REGEX_LINE");
  IElementType LITERAL_SIGIL_BODY = new ElixirElementType("LITERAL_SIGIL_BODY");
  IElementType LITERAL_SIGIL_HEREDOC = new ElixirElementType("LITERAL_SIGIL_HEREDOC");
  IElementType LITERAL_SIGIL_HEREDOC_LINE = new ElixirElementType("LITERAL_SIGIL_HEREDOC_LINE");
  IElementType LITERAL_SIGIL_LINE = new ElixirElementType("LITERAL_SIGIL_LINE");
  IElementType LITERAL_STRING_BODY = new ElixirElementType("LITERAL_STRING_BODY");
  IElementType LITERAL_STRING_HEREDOC_LINE = new ElixirElementType("LITERAL_STRING_HEREDOC_LINE");
  IElementType LITERAL_STRING_SIGIL_HEREDOC = new ElixirElementType("LITERAL_STRING_SIGIL_HEREDOC");
  IElementType LITERAL_STRING_SIGIL_LINE = new ElixirElementType("LITERAL_STRING_SIGIL_LINE");
  IElementType LITERAL_WORDS_BODY = new ElixirElementType("LITERAL_WORDS_BODY");
  IElementType LITERAL_WORDS_HEREDOC = new ElixirElementType("LITERAL_WORDS_HEREDOC");
  IElementType LITERAL_WORDS_HEREDOC_LINE = new ElixirElementType("LITERAL_WORDS_HEREDOC_LINE");
  IElementType LITERAL_WORDS_LINE = new ElixirElementType("LITERAL_WORDS_LINE");
  IElementType MAP_ARGUMENTS = new ElixirElementType("MAP_ARGUMENTS");
  IElementType MAP_CONSTRUCTION_ARGUMENTS = new ElixirElementType("MAP_CONSTRUCTION_ARGUMENTS");
  IElementType MAP_OPERATION = new ElixirElementType("MAP_OPERATION");
  IElementType MAP_PREFIX_OPERATOR = new ElixirElementType("MAP_PREFIX_OPERATOR");
  IElementType MAP_UPDATE_ARGUMENTS = new ElixirElementType("MAP_UPDATE_ARGUMENTS");
  IElementType MATCHED_ADDITION_OPERATION = new ElixirElementType("MATCHED_ADDITION_OPERATION");
  IElementType MATCHED_AND_OPERATION = new ElixirElementType("MATCHED_AND_OPERATION");
  IElementType MATCHED_ARROW_OPERATION = new ElixirElementType("MATCHED_ARROW_OPERATION");
  IElementType MATCHED_AT_NON_NUMERIC_OPERATION = new ElixirElementType("MATCHED_AT_NON_NUMERIC_OPERATION");
  IElementType MATCHED_AT_UNQUALIFIED_BRACKET_OPERATION = new ElixirElementType("MATCHED_AT_UNQUALIFIED_BRACKET_OPERATION");
  IElementType MATCHED_AT_UNQUALIFIED_NO_PARENTHESES_CALL = new ElixirElementType("MATCHED_AT_UNQUALIFIED_NO_PARENTHESES_CALL");
  IElementType MATCHED_BRACKET_OPERATION = new ElixirElementType("MATCHED_BRACKET_OPERATION");
  IElementType MATCHED_CAPTURE_NON_NUMERIC_OPERATION = new ElixirElementType("MATCHED_CAPTURE_NON_NUMERIC_OPERATION");
  IElementType MATCHED_COMPARISON_OPERATION = new ElixirElementType("MATCHED_COMPARISON_OPERATION");
  IElementType MATCHED_DOT_CALL_OPERATION = new ElixirElementType("MATCHED_DOT_CALL_OPERATION");
  IElementType MATCHED_EXPRESSION = new ElixirElementType("MATCHED_EXPRESSION");
  IElementType MATCHED_HAT_OPERATION = new ElixirElementType("MATCHED_HAT_OPERATION");
  IElementType MATCHED_IN_MATCH_OPERATION = new ElixirElementType("MATCHED_IN_MATCH_OPERATION");
  IElementType MATCHED_IN_OPERATION = new ElixirElementType("MATCHED_IN_OPERATION");
  IElementType MATCHED_MATCH_OPERATION = new ElixirElementType("MATCHED_MATCH_OPERATION");
  IElementType MATCHED_MULTIPLICATION_OPERATION = new ElixirElementType("MATCHED_MULTIPLICATION_OPERATION");
  IElementType MATCHED_OR_OPERATION = new ElixirElementType("MATCHED_OR_OPERATION");
  IElementType MATCHED_PARENTHESES_ARGUMENTS = new ElixirElementType("MATCHED_PARENTHESES_ARGUMENTS");
  IElementType MATCHED_PIPE_OPERATION = new ElixirElementType("MATCHED_PIPE_OPERATION");
  IElementType MATCHED_QUALIFIED_ALIAS_OPERATION = new ElixirElementType("MATCHED_QUALIFIED_ALIAS_OPERATION");
  IElementType MATCHED_QUALIFIED_BRACKET_OPERATION = new ElixirElementType("MATCHED_QUALIFIED_BRACKET_OPERATION");
  IElementType MATCHED_QUALIFIED_NO_ARGUMENTS_CALL = new ElixirElementType("MATCHED_QUALIFIED_NO_ARGUMENTS_CALL");
  IElementType MATCHED_QUALIFIED_NO_PARENTHESES_CALL = new ElixirElementType("MATCHED_QUALIFIED_NO_PARENTHESES_CALL");
  IElementType MATCHED_QUALIFIED_PARENTHESES_CALL = new ElixirElementType("MATCHED_QUALIFIED_PARENTHESES_CALL");
  IElementType MATCHED_RELATIONAL_OPERATION = new ElixirElementType("MATCHED_RELATIONAL_OPERATION");
  IElementType MATCHED_TWO_OPERATION = new ElixirElementType("MATCHED_TWO_OPERATION");
  IElementType MATCHED_TYPE_OPERATION = new ElixirElementType("MATCHED_TYPE_OPERATION");
  IElementType MATCHED_UNARY_NON_NUMERIC_OPERATION = new ElixirElementType("MATCHED_UNARY_NON_NUMERIC_OPERATION");
  IElementType MATCHED_UNQUALIFIED_BRACKET_OPERATION = new ElixirElementType("MATCHED_UNQUALIFIED_BRACKET_OPERATION");
  IElementType MATCHED_UNQUALIFIED_NO_PARENTHESES_CALL = new ElixirElementType("MATCHED_UNQUALIFIED_NO_PARENTHESES_CALL");
  IElementType MATCHED_UNQUALIFIED_PARENTHESES_CALL = new ElixirElementType("MATCHED_UNQUALIFIED_PARENTHESES_CALL");
  IElementType MATCHED_WHEN_OPERATION = new ElixirElementType("MATCHED_WHEN_OPERATION");
  IElementType MATCH_INFIX_OPERATOR = new ElixirElementType("MATCH_INFIX_OPERATOR");
  IElementType MULTIPLICATION_INFIX_OPERATOR = new ElixirElementType("MULTIPLICATION_INFIX_OPERATOR");
  IElementType NO_PARENTHESES_ARGUMENTS = new ElixirElementType("NO_PARENTHESES_ARGUMENTS");
  IElementType NO_PARENTHESES_EXPRESSION = new ElixirElementType("NO_PARENTHESES_EXPRESSION");
  IElementType NO_PARENTHESES_FIRST_POSITIONAL = new ElixirElementType("NO_PARENTHESES_FIRST_POSITIONAL");
  IElementType NO_PARENTHESES_KEYWORDS = new ElixirElementType("NO_PARENTHESES_KEYWORDS");
  IElementType NO_PARENTHESES_KEYWORD_PAIR = new ElixirElementType("NO_PARENTHESES_KEYWORD_PAIR");
  IElementType NO_PARENTHESES_MANY_ARGUMENTS = new ElixirElementType("NO_PARENTHESES_MANY_ARGUMENTS");
  IElementType NO_PARENTHESES_MANY_ARGUMENTS_UNQUALIFIED_IDENTIFIER = new ElixirElementType("NO_PARENTHESES_MANY_ARGUMENTS_UNQUALIFIED_IDENTIFIER");
  IElementType NO_PARENTHESES_MANY_POSITIONAL_AND_MAYBE_KEYWORDS_ARGUMENTS = new ElixirElementType("NO_PARENTHESES_MANY_POSITIONAL_AND_MAYBE_KEYWORDS_ARGUMENTS");
  IElementType NO_PARENTHESES_MANY_STRICT_NO_PARENTHESES_EXPRESSION = new ElixirElementType("NO_PARENTHESES_MANY_STRICT_NO_PARENTHESES_EXPRESSION");
  IElementType NO_PARENTHESES_ONE_ARGUMENT = new ElixirElementType("NO_PARENTHESES_ONE_ARGUMENT");
  IElementType NO_PARENTHESES_ONE_POSITIONAL_AND_KEYWORDS_ARGUMENTS = new ElixirElementType("NO_PARENTHESES_ONE_POSITIONAL_AND_KEYWORDS_ARGUMENTS");
  IElementType NO_PARENTHESES_STRICT = new ElixirElementType("NO_PARENTHESES_STRICT");
  IElementType OCTAL_DIGITS = new ElixirElementType("OCTAL_DIGITS");
  IElementType OCTAL_WHOLE_NUMBER = new ElixirElementType("OCTAL_WHOLE_NUMBER");
  IElementType OPEN_HEXADECIMAL_ESCAPE_SEQUENCE = new ElixirElementType("OPEN_HEXADECIMAL_ESCAPE_SEQUENCE");
  IElementType OR_INFIX_OPERATOR = new ElixirElementType("OR_INFIX_OPERATOR");
  IElementType PARENTHESES_ARGUMENTS = new ElixirElementType("PARENTHESES_ARGUMENTS");
  IElementType PARENTHETICAL_STAB = new ElixirElementType("PARENTHETICAL_STAB");
  IElementType PIPE_INFIX_OPERATOR = new ElixirElementType("PIPE_INFIX_OPERATOR");
  IElementType QUOTE_CHAR_LIST_BODY = new ElixirElementType("QUOTE_CHAR_LIST_BODY");
  IElementType QUOTE_HEXADECIMAL_ESCAPE_SEQUENCE = new ElixirElementType("QUOTE_HEXADECIMAL_ESCAPE_SEQUENCE");
  IElementType QUOTE_STRING_BODY = new ElixirElementType("QUOTE_STRING_BODY");
  IElementType RELATIONAL_INFIX_OPERATOR = new ElixirElementType("RELATIONAL_INFIX_OPERATOR");
  IElementType RELATIVE_IDENTIFIER = new ElixirElementType("RELATIVE_IDENTIFIER");
  IElementType SIGIL_HEXADECIMAL_ESCAPE_SEQUENCE = new ElixirElementType("SIGIL_HEXADECIMAL_ESCAPE_SEQUENCE");
  IElementType SIGIL_MODIFIERS = new ElixirElementType("SIGIL_MODIFIERS");
  IElementType STAB = new ElixirElementType("STAB");
  IElementType STAB_BODY = new ElixirElementType("STAB_BODY");
  IElementType STAB_INFIX_OPERATOR = new ElixirElementType("STAB_INFIX_OPERATOR");
  IElementType STAB_NO_PARENTHESES_SIGNATURE = new ElixirElementType("STAB_NO_PARENTHESES_SIGNATURE");
  IElementType STAB_OPERATION = new ElixirElementType("STAB_OPERATION");
  IElementType STAB_PARENTHESES_SIGNATURE = new ElixirElementType("STAB_PARENTHESES_SIGNATURE");
  IElementType STAB_SIGNATURE = new ElixirElementType("STAB_SIGNATURE");
  IElementType STRING_HEREDOC = new ElixirElementType("STRING_HEREDOC");
  IElementType STRING_HEREDOC_LINE = new ElixirElementType("STRING_HEREDOC_LINE");
  IElementType STRING_LINE = new ElixirElementType("STRING_LINE");
  IElementType STRUCT_OPERATION = new ElixirElementType("STRUCT_OPERATION");
  IElementType TUPLE = new ElixirElementType("TUPLE");
  IElementType TWO_INFIX_OPERATOR = new ElixirElementType("TWO_INFIX_OPERATOR");
  IElementType TYPE_INFIX_OPERATOR = new ElixirElementType("TYPE_INFIX_OPERATOR");
  IElementType UNARY_BLOCK_OPERATION = new ElixirElementType("UNARY_BLOCK_OPERATION");
  IElementType UNARY_NUMERIC_OPERATION = new ElixirElementType("UNARY_NUMERIC_OPERATION");
  IElementType UNARY_PREFIX_OPERATOR = new ElixirElementType("UNARY_PREFIX_OPERATOR");
  IElementType UNKNOWN_BASE_DIGITS = new ElixirElementType("UNKNOWN_BASE_DIGITS");
  IElementType UNKNOWN_BASE_WHOLE_NUMBER = new ElixirElementType("UNKNOWN_BASE_WHOLE_NUMBER");
  IElementType UNQUALIFIED_NO_PARENTHESES_MANY_ARGUMENTS_CALL = new ElixirElementType("UNQUALIFIED_NO_PARENTHESES_MANY_ARGUMENTS_CALL");
  IElementType VARIABLE = new ElixirElementType("VARIABLE");
  IElementType WHEN_INFIX_OPERATOR = new ElixirElementType("WHEN_INFIX_OPERATOR");

  IElementType AFTER = new ElixirTokenType("after");
  IElementType ALIAS_TOKEN = new ElixirTokenType("Alias");
  IElementType AND_OPERATOR = new ElixirTokenType("AND_OPERATOR");
  IElementType ARROW_OPERATOR = new ElixirTokenType("ARROW_OPERATOR");
  IElementType ASSOCIATION_OPERATOR = new ElixirTokenType("ASSOCIATION_OPERATOR");
  IElementType ATOM_FRAGMENT = new ElixirTokenType("ATOM_FRAGMENT");
  IElementType AT_OPERATOR = new ElixirTokenType("@");
  IElementType BASE_WHOLE_NUMBER_PREFIX = new ElixirTokenType("0");
  IElementType BINARY_WHOLE_NUMBER_BASE = new ElixirTokenType("b");
  IElementType BIT_STRING_OPERATOR = new ElixirTokenType("BIT_STRING_OPERATOR");
  IElementType CALL = new ElixirTokenType("<zero-width-call>");
  IElementType CAPTURE_OPERATOR = new ElixirTokenType("&");
  IElementType CATCH = new ElixirTokenType("catch");
  IElementType CHAR_LIST_FRAGMENT = new ElixirTokenType("CHAR_LIST_FRAGMENT");
  IElementType CHAR_LIST_HEREDOC_PROMOTER = new ElixirTokenType("'''");
  IElementType CHAR_LIST_HEREDOC_TERMINATOR = new ElixirTokenType("CHAR_LIST_HEREDOC_TERMINATOR");
  IElementType CHAR_LIST_PROMOTER = new ElixirTokenType("'");
  IElementType CHAR_LIST_SIGIL_HEREDOC_PROMOTER = new ElixirTokenType("CHAR_LIST_SIGIL_HEREDOC_PROMOTER");
  IElementType CHAR_LIST_SIGIL_HEREDOC_TERMINATOR = new ElixirTokenType("CHAR_LIST_SIGIL_HEREDOC_TERMINATOR");
  IElementType CHAR_LIST_SIGIL_PROMOTER = new ElixirTokenType("CHAR_LIST_SIGIL_PROMOTER");
  IElementType CHAR_LIST_SIGIL_TERMINATOR = new ElixirTokenType("CHAR_LIST_SIGIL_TERMINATOR");
  IElementType CHAR_LIST_TERMINATOR = new ElixirTokenType("CHAR_LIST_TERMINATOR");
  IElementType CHAR_TOKENIZER = new ElixirTokenType("?");
  IElementType CLOSING_BIT = new ElixirTokenType(">>");
  IElementType CLOSING_BRACKET = new ElixirTokenType("]");
  IElementType CLOSING_CURLY = new ElixirTokenType("CLOSING_CURLY");
  IElementType CLOSING_PARENTHESIS = new ElixirTokenType(")");
  IElementType COLON = new ElixirTokenType(":");
  IElementType COMMA = new ElixirTokenType(",");
  IElementType COMMENT = new ElixirTokenType("COMMENT");
  IElementType COMPARISON_OPERATOR = new ElixirTokenType("COMPARISON_OPERATOR");
  IElementType DECIMAL_MARK = new ElixirTokenType("DECIMAL_MARK");
  IElementType DECIMAL_SEPARATOR = new ElixirTokenType("_");
  IElementType DO = new ElixirTokenType("do");
  IElementType DOT_OPERATOR = new ElixirTokenType(".");
  IElementType DUAL_OPERATOR = new ElixirTokenType("DUAL_OPERATOR");
  IElementType ELSE = new ElixirTokenType("else");
  IElementType END = new ElixirTokenType("end");
  IElementType EOL = new ElixirTokenType("EOL");
  IElementType ESCAPE = new ElixirTokenType("ESCAPE");
  IElementType ESCAPED_CHARACTER_TOKEN = new ElixirTokenType("ESCAPED_CHARACTER_TOKEN");
  IElementType EXPONENT_MARK = new ElixirTokenType("EXPONENT_MARK");
  IElementType FALSE = new ElixirTokenType("false");
  IElementType FN = new ElixirTokenType("fn");
  IElementType HAT_OPERATOR = new ElixirTokenType("HAT_OPERATOR");
  IElementType HEREDOC_LINE_WHITE_SPACE_TOKEN = new ElixirTokenType("HEREDOC_LINE_WHITE_SPACE_TOKEN");
  IElementType HEREDOC_PREFIX_WHITE_SPACE = new ElixirTokenType("HEREDOC_PREFIX_WHITE_SPACE");
  IElementType HEXADECIMAL_WHOLE_NUMBER_BASE = new ElixirTokenType("x");
  IElementType IDENTIFIER = new ElixirTokenType("identifier");
  IElementType INTERPOLATING_CHAR_LIST_SIGIL_NAME = new ElixirTokenType("INTERPOLATING_CHAR_LIST_SIGIL_NAME");
  IElementType INTERPOLATING_REGEX_SIGIL_NAME = new ElixirTokenType("INTERPOLATING_REGEX_SIGIL_NAME");
  IElementType INTERPOLATING_SIGIL_NAME = new ElixirTokenType("INTERPOLATING_SIGIL_NAME");
  IElementType INTERPOLATING_STRING_SIGIL_NAME = new ElixirTokenType("INTERPOLATING_STRING_SIGIL_NAME");
  IElementType INTERPOLATING_WORDS_SIGIL_NAME = new ElixirTokenType("INTERPOLATING_WORDS_SIGIL_NAME");
  IElementType INTERPOLATION_END = new ElixirTokenType("INTERPOLATION_END");
  IElementType INTERPOLATION_START = new ElixirTokenType("INTERPOLATION_START");
  IElementType INVALID_BINARY_DIGITS = new ElixirTokenType("INVALID_BINARY_DIGITS");
  IElementType INVALID_DECIMAL_DIGITS = new ElixirTokenType("INVALID_DECIMAL_DIGITS");
  IElementType INVALID_HEXADECIMAL_DIGITS = new ElixirTokenType("INVALID_HEXADECIMAL_DIGITS");
  IElementType INVALID_OCTAL_DIGITS = new ElixirTokenType("INVALID_OCTAL_DIGITS");
  IElementType INVALID_UNKNOWN_BASE_DIGITS = new ElixirTokenType("INVALID_UNKNOWN_BASE_DIGITS");
  IElementType IN_MATCH_OPERATOR = new ElixirTokenType("IN_MATCH_OPERATOR");
  IElementType IN_OPERATOR = new ElixirTokenType("in");
  IElementType KEYWORD_PAIR_COLON = new ElixirTokenType("KEYWORD_PAIR_COLON");
  IElementType LITERAL_CHAR_LIST_SIGIL_NAME = new ElixirTokenType("LITERAL_CHAR_LIST_SIGIL_NAME");
  IElementType LITERAL_REGEX_SIGIL_NAME = new ElixirTokenType("LITERAL_REGEX_SIGIL_NAME");
  IElementType LITERAL_SIGIL_NAME = new ElixirTokenType("LITERAL_SIGIL_NAME");
  IElementType LITERAL_STRING_SIGIL_NAME = new ElixirTokenType("LITERAL_STRING_SIGIL_NAME");
  IElementType LITERAL_WORDS_SIGIL_NAME = new ElixirTokenType("LITERAL_WORDS_SIGIL_NAME");
  IElementType MAP_OPERATOR = new ElixirTokenType("%{}");
  IElementType MATCHEDPARENTHESESARGUMENTS_1_0 = new ElixirTokenType("matchedParenthesesArguments_1_0");
  IElementType MATCH_OPERATOR = new ElixirTokenType("MATCH_OPERATOR");
  IElementType MULTIPLICATION_OPERATOR = new ElixirTokenType("MULTIPLICATION_OPERATOR");
  IElementType NIL = new ElixirTokenType("nil");
  IElementType OBSOLETE_BINARY_WHOLE_NUMBER_BASE = new ElixirTokenType("B");
  IElementType OBSOLETE_HEXADECIMAL_WHOLE_NUMBER_BASE = new ElixirTokenType("X");
  IElementType OCTAL_WHOLE_NUMBER_BASE = new ElixirTokenType("o");
  IElementType OPENING_BIT = new ElixirTokenType("<<");
  IElementType OPENING_BRACKET = new ElixirTokenType("[");
  IElementType OPENING_CURLY = new ElixirTokenType("OPENING_CURLY");
  IElementType OPENING_PARENTHESIS = new ElixirTokenType("(");
  IElementType OR_OPERATOR = new ElixirTokenType("OR_OPERATOR");
  IElementType PIPE_OPERATOR = new ElixirTokenType("PIPE_OPERATOR");
  IElementType REGEX_FRAGMENT = new ElixirTokenType("REGEX_FRAGMENT");
  IElementType REGEX_HEREDOC_PROMOTER = new ElixirTokenType("REGEX_HEREDOC_PROMOTER");
  IElementType REGEX_HEREDOC_TERMINATOR = new ElixirTokenType("REGEX_HEREDOC_TERMINATOR");
  IElementType REGEX_PROMOTER = new ElixirTokenType("REGEX_PROMOTER");
  IElementType REGEX_TERMINATOR = new ElixirTokenType("REGEX_TERMINATOR");
  IElementType RELATIONAL_OPERATOR = new ElixirTokenType("RELATIONAL_OPERATOR");
  IElementType RESCUE = new ElixirTokenType("rescue");
  IElementType SEMICOLON = new ElixirTokenType(";");
  IElementType SIGIL_FRAGMENT = new ElixirTokenType("SIGIL_FRAGMENT");
  IElementType SIGIL_HEREDOC_PROMOTER = new ElixirTokenType("SIGIL_HEREDOC_PROMOTER");
  IElementType SIGIL_HEREDOC_TERMINATOR = new ElixirTokenType("SIGIL_HEREDOC_TERMINATOR");
  IElementType SIGIL_MODIFIER = new ElixirTokenType("SIGIL_MODIFIER");
  IElementType SIGIL_PROMOTER = new ElixirTokenType("SIGIL_PROMOTER");
  IElementType SIGIL_TERMINATOR = new ElixirTokenType("SIGIL_TERMINATOR");
  IElementType SIGNIFICANT_WHITE_SPACE = new ElixirTokenType("<significant-space>");
  IElementType STAB_OPERATOR = new ElixirTokenType("STAB_OPERATOR");
  IElementType STRING_FRAGMENT = new ElixirTokenType("STRING_FRAGMENT");
  IElementType STRING_HEREDOC_PROMOTER = new ElixirTokenType("\"\"\"");
  IElementType STRING_HEREDOC_TERMINATOR = new ElixirTokenType("STRING_HEREDOC_TERMINATOR");
  IElementType STRING_PROMOTER = new ElixirTokenType("\"");
  IElementType STRING_SIGIL_HEREDOC_PROMOTER = new ElixirTokenType("STRING_SIGIL_HEREDOC_PROMOTER");
  IElementType STRING_SIGIL_HEREDOC_TERMINATOR = new ElixirTokenType("STRING_SIGIL_HEREDOC_TERMINATOR");
  IElementType STRING_SIGIL_PROMOTER = new ElixirTokenType("STRING_SIGIL_PROMOTER");
  IElementType STRING_SIGIL_TERMINATOR = new ElixirTokenType("STRING_SIGIL_TERMINATOR");
  IElementType STRING_TERMINATOR = new ElixirTokenType("STRING_TERMINATOR");
  IElementType STRUCT_OPERATOR = new ElixirTokenType("%");
  IElementType TILDE = new ElixirTokenType("~");
  IElementType TRUE = new ElixirTokenType("true");
  IElementType TUPLE_OPERATOR = new ElixirTokenType("TUPLE_OPERATOR");
  IElementType TWO_OPERATOR = new ElixirTokenType("TWO_OPERATOR");
  IElementType TYPE_OPERATOR = new ElixirTokenType("::");
  IElementType UNARY_OPERATOR = new ElixirTokenType("UNARY_OPERATOR");
  IElementType UNKNOWN_WHOLE_NUMBER_BASE = new ElixirTokenType("UNKNOWN_WHOLE_NUMBER_BASE");
  IElementType VALID_BINARY_DIGITS = new ElixirTokenType("VALID_BINARY_DIGITS");
  IElementType VALID_DECIMAL_DIGITS = new ElixirTokenType("VALID_DECIMAL_DIGITS");
  IElementType VALID_HEXADECIMAL_DIGITS = new ElixirTokenType("VALID_HEXADECIMAL_DIGITS");
  IElementType VALID_OCTAL_DIGITS = new ElixirTokenType("VALID_OCTAL_DIGITS");
  IElementType WHEN_OPERATOR = new ElixirTokenType("WHEN_OPERATOR");
  IElementType WORDS_FRAGMENT = new ElixirTokenType("WORDS_FRAGMENT");
  IElementType WORDS_HEREDOC_PROMOTER = new ElixirTokenType("WORDS_HEREDOC_PROMOTER");
  IElementType WORDS_HEREDOC_TERMINATOR = new ElixirTokenType("WORDS_HEREDOC_TERMINATOR");
  IElementType WORDS_PROMOTER = new ElixirTokenType("WORDS_PROMOTER");
  IElementType WORDS_TERMINATOR = new ElixirTokenType("WORDS_TERMINATOR");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ACCESS_EXPRESSION) {
        return new ElixirAccessExpressionImpl(node);
      }
      else if (type == ADDITION_INFIX_OPERATOR) {
        return new ElixirAdditionInfixOperatorImpl(node);
      }
      else if (type == ADJACENT_EXPRESSION) {
        return new ElixirAdjacentExpressionImpl(node);
      }
      else if (type == ALIAS) {
        return new ElixirAliasImpl(node);
      }
      else if (type == AND_INFIX_OPERATOR) {
        return new ElixirAndInfixOperatorImpl(node);
      }
      else if (type == ANONYMOUS_FUNCTION) {
        return new ElixirAnonymousFunctionImpl(node);
      }
      else if (type == ARROW_INFIX_OPERATOR) {
        return new ElixirArrowInfixOperatorImpl(node);
      }
      else if (type == ASSOCIATIONS) {
        return new ElixirAssociationsImpl(node);
      }
      else if (type == ASSOCIATIONS_BASE) {
        return new ElixirAssociationsBaseImpl(node);
      }
      else if (type == ATOM) {
        return new ElixirAtomImpl(node);
      }
      else if (type == ATOM_KEYWORD) {
        return new ElixirAtomKeywordImpl(node);
      }
      else if (type == AT_BLOCK_OPERATION) {
        return new ElixirAtBlockOperationImpl(node);
      }
      else if (type == AT_NUMERIC_OPERATION) {
        return new ElixirAtNumericOperationImpl(node);
      }
      else if (type == AT_PREFIX_OPERATOR) {
        return new ElixirAtPrefixOperatorImpl(node);
      }
      else if (type == BINARY_DIGITS) {
        return new ElixirBinaryDigitsImpl(node);
      }
      else if (type == BINARY_WHOLE_NUMBER) {
        return new ElixirBinaryWholeNumberImpl(node);
      }
      else if (type == BIT_STRING) {
        return new ElixirBitStringImpl(node);
      }
      else if (type == BLOCK_EXPRESSION) {
        return new ElixirBlockExpressionImpl(node);
      }
      else if (type == BLOCK_IDENTIFIER) {
        return new ElixirBlockIdentifierImpl(node);
      }
      else if (type == BLOCK_ITEM) {
        return new ElixirBlockItemImpl(node);
      }
      else if (type == BLOCK_LIST) {
        return new ElixirBlockListImpl(node);
      }
      else if (type == BLOCK_NO_PARENTHESES_CALL) {
        return new ElixirBlockNoParenthesesCallImpl(node);
      }
      else if (type == BRACKET_ARGUMENTS) {
        return new ElixirBracketArgumentsImpl(node);
      }
      else if (type == CAPTURE_BLOCK_OPERATION) {
        return new ElixirCaptureBlockOperationImpl(node);
      }
      else if (type == CAPTURE_EXPRESSION_OPERATION) {
        return new ElixirCaptureExpressionOperationImpl(node);
      }
      else if (type == CAPTURE_NUMERIC_OPERATION) {
        return new ElixirCaptureNumericOperationImpl(node);
      }
      else if (type == CAPTURE_PREFIX_OPERATOR) {
        return new ElixirCapturePrefixOperatorImpl(node);
      }
      else if (type == CHAR_LIST_HEREDOC) {
        return new ElixirCharListHeredocImpl(node);
      }
      else if (type == CHAR_LIST_HEREDOC_LINE) {
        return new ElixirCharListHeredocLineImpl(node);
      }
      else if (type == CHAR_LIST_LINE) {
        return new ElixirCharListLineImpl(node);
      }
      else if (type == CHAR_TOKEN) {
        return new ElixirCharTokenImpl(node);
      }
      else if (type == COMPARISON_INFIX_OPERATOR) {
        return new ElixirComparisonInfixOperatorImpl(node);
      }
      else if (type == CONTAINER_ASSOCIATION_OPERATION) {
        return new ElixirContainerAssociationOperationImpl(node);
      }
      else if (type == DECIMAL_DIGITS) {
        return new ElixirDecimalDigitsImpl(node);
      }
      else if (type == DECIMAL_FLOAT) {
        return new ElixirDecimalFloatImpl(node);
      }
      else if (type == DECIMAL_FLOAT_EXPONENT) {
        return new ElixirDecimalFloatExponentImpl(node);
      }
      else if (type == DECIMAL_FLOAT_EXPONENT_SIGN) {
        return new ElixirDecimalFloatExponentSignImpl(node);
      }
      else if (type == DECIMAL_FLOAT_FRACTIONAL) {
        return new ElixirDecimalFloatFractionalImpl(node);
      }
      else if (type == DECIMAL_FLOAT_INTEGRAL) {
        return new ElixirDecimalFloatIntegralImpl(node);
      }
      else if (type == DECIMAL_WHOLE_NUMBER) {
        return new ElixirDecimalWholeNumberImpl(node);
      }
      else if (type == DOT_INFIX_OPERATOR) {
        return new ElixirDotInfixOperatorImpl(node);
      }
      else if (type == DO_BLOCK) {
        return new ElixirDoBlockImpl(node);
      }
      else if (type == EMPTY_PARENTHESES) {
        return new ElixirEmptyParenthesesImpl(node);
      }
      else if (type == ENCLOSED_HEXADECIMAL_ESCAPE_SEQUENCE) {
        return new ElixirEnclosedHexadecimalEscapeSequenceImpl(node);
      }
      else if (type == END_OF_EXPRESSION) {
        return new ElixirEndOfExpressionImpl(node);
      }
      else if (type == ESCAPED_CHARACTER) {
        return new ElixirEscapedCharacterImpl(node);
      }
      else if (type == ESCAPED_EOL) {
        return new ElixirEscapedEOLImpl(node);
      }
      else if (type == HAT_INFIX_OPERATOR) {
        return new ElixirHatInfixOperatorImpl(node);
      }
      else if (type == HEREDOC_LINE_PREFIX) {
        return new ElixirHeredocLinePrefixImpl(node);
      }
      else if (type == HEREDOC_PREFIX) {
        return new ElixirHeredocPrefixImpl(node);
      }
      else if (type == HEXADECIMAL_DIGITS) {
        return new ElixirHexadecimalDigitsImpl(node);
      }
      else if (type == HEXADECIMAL_ESCAPE_PREFIX) {
        return new ElixirHexadecimalEscapePrefixImpl(node);
      }
      else if (type == HEXADECIMAL_WHOLE_NUMBER) {
        return new ElixirHexadecimalWholeNumberImpl(node);
      }
      else if (type == INTERPOLATED_CHAR_LIST_BODY) {
        return new ElixirInterpolatedCharListBodyImpl(node);
      }
      else if (type == INTERPOLATED_CHAR_LIST_HEREDOC_LINE) {
        return new ElixirInterpolatedCharListHeredocLineImpl(node);
      }
      else if (type == INTERPOLATED_CHAR_LIST_SIGIL_HEREDOC) {
        return new ElixirInterpolatedCharListSigilHeredocImpl(node);
      }
      else if (type == INTERPOLATED_CHAR_LIST_SIGIL_LINE) {
        return new ElixirInterpolatedCharListSigilLineImpl(node);
      }
      else if (type == INTERPOLATED_REGEX_BODY) {
        return new ElixirInterpolatedRegexBodyImpl(node);
      }
      else if (type == INTERPOLATED_REGEX_HEREDOC) {
        return new ElixirInterpolatedRegexHeredocImpl(node);
      }
      else if (type == INTERPOLATED_REGEX_HEREDOC_LINE) {
        return new ElixirInterpolatedRegexHeredocLineImpl(node);
      }
      else if (type == INTERPOLATED_REGEX_LINE) {
        return new ElixirInterpolatedRegexLineImpl(node);
      }
      else if (type == INTERPOLATED_SIGIL_BODY) {
        return new ElixirInterpolatedSigilBodyImpl(node);
      }
      else if (type == INTERPOLATED_SIGIL_HEREDOC) {
        return new ElixirInterpolatedSigilHeredocImpl(node);
      }
      else if (type == INTERPOLATED_SIGIL_HEREDOC_LINE) {
        return new ElixirInterpolatedSigilHeredocLineImpl(node);
      }
      else if (type == INTERPOLATED_SIGIL_LINE) {
        return new ElixirInterpolatedSigilLineImpl(node);
      }
      else if (type == INTERPOLATED_STRING_BODY) {
        return new ElixirInterpolatedStringBodyImpl(node);
      }
      else if (type == INTERPOLATED_STRING_HEREDOC_LINE) {
        return new ElixirInterpolatedStringHeredocLineImpl(node);
      }
      else if (type == INTERPOLATED_STRING_SIGIL_HEREDOC) {
        return new ElixirInterpolatedStringSigilHeredocImpl(node);
      }
      else if (type == INTERPOLATED_STRING_SIGIL_LINE) {
        return new ElixirInterpolatedStringSigilLineImpl(node);
      }
      else if (type == INTERPOLATED_WORDS_BODY) {
        return new ElixirInterpolatedWordsBodyImpl(node);
      }
      else if (type == INTERPOLATED_WORDS_HEREDOC) {
        return new ElixirInterpolatedWordsHeredocImpl(node);
      }
      else if (type == INTERPOLATED_WORDS_HEREDOC_LINE) {
        return new ElixirInterpolatedWordsHeredocLineImpl(node);
      }
      else if (type == INTERPOLATED_WORDS_LINE) {
        return new ElixirInterpolatedWordsLineImpl(node);
      }
      else if (type == INTERPOLATION) {
        return new ElixirInterpolationImpl(node);
      }
      else if (type == IN_INFIX_OPERATOR) {
        return new ElixirInInfixOperatorImpl(node);
      }
      else if (type == IN_MATCH_INFIX_OPERATOR) {
        return new ElixirInMatchInfixOperatorImpl(node);
      }
      else if (type == KEYWORDS) {
        return new ElixirKeywordsImpl(node);
      }
      else if (type == KEYWORD_KEY) {
        return new ElixirKeywordKeyImpl(node);
      }
      else if (type == KEYWORD_PAIR) {
        return new ElixirKeywordPairImpl(node);
      }
      else if (type == LIST) {
        return new ElixirListImpl(node);
      }
      else if (type == LITERAL_CHAR_LIST_BODY) {
        return new ElixirLiteralCharListBodyImpl(node);
      }
      else if (type == LITERAL_CHAR_LIST_HEREDOC_LINE) {
        return new ElixirLiteralCharListHeredocLineImpl(node);
      }
      else if (type == LITERAL_CHAR_LIST_SIGIL_HEREDOC) {
        return new ElixirLiteralCharListSigilHeredocImpl(node);
      }
      else if (type == LITERAL_CHAR_LIST_SIGIL_LINE) {
        return new ElixirLiteralCharListSigilLineImpl(node);
      }
      else if (type == LITERAL_REGEX_BODY) {
        return new ElixirLiteralRegexBodyImpl(node);
      }
      else if (type == LITERAL_REGEX_HEREDOC) {
        return new ElixirLiteralRegexHeredocImpl(node);
      }
      else if (type == LITERAL_REGEX_HEREDOC_LINE) {
        return new ElixirLiteralRegexHeredocLineImpl(node);
      }
      else if (type == LITERAL_REGEX_LINE) {
        return new ElixirLiteralRegexLineImpl(node);
      }
      else if (type == LITERAL_SIGIL_BODY) {
        return new ElixirLiteralSigilBodyImpl(node);
      }
      else if (type == LITERAL_SIGIL_HEREDOC) {
        return new ElixirLiteralSigilHeredocImpl(node);
      }
      else if (type == LITERAL_SIGIL_HEREDOC_LINE) {
        return new ElixirLiteralSigilHeredocLineImpl(node);
      }
      else if (type == LITERAL_SIGIL_LINE) {
        return new ElixirLiteralSigilLineImpl(node);
      }
      else if (type == LITERAL_STRING_BODY) {
        return new ElixirLiteralStringBodyImpl(node);
      }
      else if (type == LITERAL_STRING_HEREDOC_LINE) {
        return new ElixirLiteralStringHeredocLineImpl(node);
      }
      else if (type == LITERAL_STRING_SIGIL_HEREDOC) {
        return new ElixirLiteralStringSigilHeredocImpl(node);
      }
      else if (type == LITERAL_STRING_SIGIL_LINE) {
        return new ElixirLiteralStringSigilLineImpl(node);
      }
      else if (type == LITERAL_WORDS_BODY) {
        return new ElixirLiteralWordsBodyImpl(node);
      }
      else if (type == LITERAL_WORDS_HEREDOC) {
        return new ElixirLiteralWordsHeredocImpl(node);
      }
      else if (type == LITERAL_WORDS_HEREDOC_LINE) {
        return new ElixirLiteralWordsHeredocLineImpl(node);
      }
      else if (type == LITERAL_WORDS_LINE) {
        return new ElixirLiteralWordsLineImpl(node);
      }
      else if (type == MAP_ARGUMENTS) {
        return new ElixirMapArgumentsImpl(node);
      }
      else if (type == MAP_CONSTRUCTION_ARGUMENTS) {
        return new ElixirMapConstructionArgumentsImpl(node);
      }
      else if (type == MAP_OPERATION) {
        return new ElixirMapOperationImpl(node);
      }
      else if (type == MAP_PREFIX_OPERATOR) {
        return new ElixirMapPrefixOperatorImpl(node);
      }
      else if (type == MAP_UPDATE_ARGUMENTS) {
        return new ElixirMapUpdateArgumentsImpl(node);
      }
      else if (type == MATCHED_ADDITION_OPERATION) {
        return new ElixirMatchedAdditionOperationImpl(node);
      }
      else if (type == MATCHED_AND_OPERATION) {
        return new ElixirMatchedAndOperationImpl(node);
      }
      else if (type == MATCHED_ARROW_OPERATION) {
        return new ElixirMatchedArrowOperationImpl(node);
      }
      else if (type == MATCHED_AT_NON_NUMERIC_OPERATION) {
        return new ElixirMatchedAtNonNumericOperationImpl(node);
      }
      else if (type == MATCHED_AT_UNQUALIFIED_BRACKET_OPERATION) {
        return new ElixirMatchedAtUnqualifiedBracketOperationImpl(node);
      }
      else if (type == MATCHED_AT_UNQUALIFIED_NO_PARENTHESES_CALL) {
        return new ElixirMatchedAtUnqualifiedNoParenthesesCallImpl(node);
      }
      else if (type == MATCHED_BRACKET_OPERATION) {
        return new ElixirMatchedBracketOperationImpl(node);
      }
      else if (type == MATCHED_CAPTURE_NON_NUMERIC_OPERATION) {
        return new ElixirMatchedCaptureNonNumericOperationImpl(node);
      }
      else if (type == MATCHED_COMPARISON_OPERATION) {
        return new ElixirMatchedComparisonOperationImpl(node);
      }
      else if (type == MATCHED_DOT_CALL_OPERATION) {
        return new ElixirMatchedDotCallOperationImpl(node);
      }
      else if (type == MATCHED_EXPRESSION) {
        return new ElixirMatchedExpressionImpl(node);
      }
      else if (type == MATCHED_HAT_OPERATION) {
        return new ElixirMatchedHatOperationImpl(node);
      }
      else if (type == MATCHED_IN_MATCH_OPERATION) {
        return new ElixirMatchedInMatchOperationImpl(node);
      }
      else if (type == MATCHED_IN_OPERATION) {
        return new ElixirMatchedInOperationImpl(node);
      }
      else if (type == MATCHED_MATCH_OPERATION) {
        return new ElixirMatchedMatchOperationImpl(node);
      }
      else if (type == MATCHED_MULTIPLICATION_OPERATION) {
        return new ElixirMatchedMultiplicationOperationImpl(node);
      }
      else if (type == MATCHED_OR_OPERATION) {
        return new ElixirMatchedOrOperationImpl(node);
      }
      else if (type == MATCHED_PARENTHESES_ARGUMENTS) {
        return new ElixirMatchedParenthesesArgumentsImpl(node);
      }
      else if (type == MATCHED_PIPE_OPERATION) {
        return new ElixirMatchedPipeOperationImpl(node);
      }
      else if (type == MATCHED_QUALIFIED_ALIAS_OPERATION) {
        return new ElixirMatchedQualifiedAliasOperationImpl(node);
      }
      else if (type == MATCHED_QUALIFIED_BRACKET_OPERATION) {
        return new ElixirMatchedQualifiedBracketOperationImpl(node);
      }
      else if (type == MATCHED_QUALIFIED_NO_ARGUMENTS_CALL) {
        return new ElixirMatchedQualifiedNoArgumentsCallImpl(node);
      }
      else if (type == MATCHED_QUALIFIED_NO_PARENTHESES_CALL) {
        return new ElixirMatchedQualifiedNoParenthesesCallImpl(node);
      }
      else if (type == MATCHED_QUALIFIED_PARENTHESES_CALL) {
        return new ElixirMatchedQualifiedParenthesesCallImpl(node);
      }
      else if (type == MATCHED_RELATIONAL_OPERATION) {
        return new ElixirMatchedRelationalOperationImpl(node);
      }
      else if (type == MATCHED_TWO_OPERATION) {
        return new ElixirMatchedTwoOperationImpl(node);
      }
      else if (type == MATCHED_TYPE_OPERATION) {
        return new ElixirMatchedTypeOperationImpl(node);
      }
      else if (type == MATCHED_UNARY_NON_NUMERIC_OPERATION) {
        return new ElixirMatchedUnaryNonNumericOperationImpl(node);
      }
      else if (type == MATCHED_UNQUALIFIED_BRACKET_OPERATION) {
        return new ElixirMatchedUnqualifiedBracketOperationImpl(node);
      }
      else if (type == MATCHED_UNQUALIFIED_NO_PARENTHESES_CALL) {
        return new ElixirMatchedUnqualifiedNoParenthesesCallImpl(node);
      }
      else if (type == MATCHED_UNQUALIFIED_PARENTHESES_CALL) {
        return new ElixirMatchedUnqualifiedParenthesesCallImpl(node);
      }
      else if (type == MATCHED_WHEN_OPERATION) {
        return new ElixirMatchedWhenOperationImpl(node);
      }
      else if (type == MATCH_INFIX_OPERATOR) {
        return new ElixirMatchInfixOperatorImpl(node);
      }
      else if (type == MULTIPLICATION_INFIX_OPERATOR) {
        return new ElixirMultiplicationInfixOperatorImpl(node);
      }
      else if (type == NO_PARENTHESES_ARGUMENTS) {
        return new ElixirNoParenthesesArgumentsImpl(node);
      }
      else if (type == NO_PARENTHESES_EXPRESSION) {
        return new ElixirNoParenthesesExpressionImpl(node);
      }
      else if (type == NO_PARENTHESES_FIRST_POSITIONAL) {
        return new ElixirNoParenthesesFirstPositionalImpl(node);
      }
      else if (type == NO_PARENTHESES_KEYWORDS) {
        return new ElixirNoParenthesesKeywordsImpl(node);
      }
      else if (type == NO_PARENTHESES_KEYWORD_PAIR) {
        return new ElixirNoParenthesesKeywordPairImpl(node);
      }
      else if (type == NO_PARENTHESES_MANY_ARGUMENTS) {
        return new ElixirNoParenthesesManyArgumentsImpl(node);
      }
      else if (type == NO_PARENTHESES_MANY_ARGUMENTS_UNQUALIFIED_IDENTIFIER) {
        return new ElixirNoParenthesesManyArgumentsUnqualifiedIdentifierImpl(node);
      }
      else if (type == NO_PARENTHESES_MANY_POSITIONAL_AND_MAYBE_KEYWORDS_ARGUMENTS) {
        return new ElixirNoParenthesesManyPositionalAndMaybeKeywordsArgumentsImpl(node);
      }
      else if (type == NO_PARENTHESES_MANY_STRICT_NO_PARENTHESES_EXPRESSION) {
        return new ElixirNoParenthesesManyStrictNoParenthesesExpressionImpl(node);
      }
      else if (type == NO_PARENTHESES_ONE_ARGUMENT) {
        return new ElixirNoParenthesesOneArgumentImpl(node);
      }
      else if (type == NO_PARENTHESES_ONE_POSITIONAL_AND_KEYWORDS_ARGUMENTS) {
        return new ElixirNoParenthesesOnePositionalAndKeywordsArgumentsImpl(node);
      }
      else if (type == NO_PARENTHESES_STRICT) {
        return new ElixirNoParenthesesStrictImpl(node);
      }
      else if (type == OCTAL_DIGITS) {
        return new ElixirOctalDigitsImpl(node);
      }
      else if (type == OCTAL_WHOLE_NUMBER) {
        return new ElixirOctalWholeNumberImpl(node);
      }
      else if (type == OPEN_HEXADECIMAL_ESCAPE_SEQUENCE) {
        return new ElixirOpenHexadecimalEscapeSequenceImpl(node);
      }
      else if (type == OR_INFIX_OPERATOR) {
        return new ElixirOrInfixOperatorImpl(node);
      }
      else if (type == PARENTHESES_ARGUMENTS) {
        return new ElixirParenthesesArgumentsImpl(node);
      }
      else if (type == PARENTHETICAL_STAB) {
        return new ElixirParentheticalStabImpl(node);
      }
      else if (type == PIPE_INFIX_OPERATOR) {
        return new ElixirPipeInfixOperatorImpl(node);
      }
      else if (type == QUOTE_CHAR_LIST_BODY) {
        return new ElixirQuoteCharListBodyImpl(node);
      }
      else if (type == QUOTE_HEXADECIMAL_ESCAPE_SEQUENCE) {
        return new ElixirQuoteHexadecimalEscapeSequenceImpl(node);
      }
      else if (type == QUOTE_STRING_BODY) {
        return new ElixirQuoteStringBodyImpl(node);
      }
      else if (type == RELATIONAL_INFIX_OPERATOR) {
        return new ElixirRelationalInfixOperatorImpl(node);
      }
      else if (type == RELATIVE_IDENTIFIER) {
        return new ElixirRelativeIdentifierImpl(node);
      }
      else if (type == SIGIL_HEXADECIMAL_ESCAPE_SEQUENCE) {
        return new ElixirSigilHexadecimalEscapeSequenceImpl(node);
      }
      else if (type == SIGIL_MODIFIERS) {
        return new ElixirSigilModifiersImpl(node);
      }
      else if (type == STAB) {
        return new ElixirStabImpl(node);
      }
      else if (type == STAB_BODY) {
        return new ElixirStabBodyImpl(node);
      }
      else if (type == STAB_INFIX_OPERATOR) {
        return new ElixirStabInfixOperatorImpl(node);
      }
      else if (type == STAB_NO_PARENTHESES_SIGNATURE) {
        return new ElixirStabNoParenthesesSignatureImpl(node);
      }
      else if (type == STAB_OPERATION) {
        return new ElixirStabOperationImpl(node);
      }
      else if (type == STAB_PARENTHESES_SIGNATURE) {
        return new ElixirStabParenthesesSignatureImpl(node);
      }
      else if (type == STAB_SIGNATURE) {
        return new ElixirStabSignatureImpl(node);
      }
      else if (type == STRING_HEREDOC) {
        return new ElixirStringHeredocImpl(node);
      }
      else if (type == STRING_HEREDOC_LINE) {
        return new ElixirStringHeredocLineImpl(node);
      }
      else if (type == STRING_LINE) {
        return new ElixirStringLineImpl(node);
      }
      else if (type == STRUCT_OPERATION) {
        return new ElixirStructOperationImpl(node);
      }
      else if (type == TUPLE) {
        return new ElixirTupleImpl(node);
      }
      else if (type == TWO_INFIX_OPERATOR) {
        return new ElixirTwoInfixOperatorImpl(node);
      }
      else if (type == TYPE_INFIX_OPERATOR) {
        return new ElixirTypeInfixOperatorImpl(node);
      }
      else if (type == UNARY_BLOCK_OPERATION) {
        return new ElixirUnaryBlockOperationImpl(node);
      }
      else if (type == UNARY_NUMERIC_OPERATION) {
        return new ElixirUnaryNumericOperationImpl(node);
      }
      else if (type == UNARY_PREFIX_OPERATOR) {
        return new ElixirUnaryPrefixOperatorImpl(node);
      }
      else if (type == UNKNOWN_BASE_DIGITS) {
        return new ElixirUnknownBaseDigitsImpl(node);
      }
      else if (type == UNKNOWN_BASE_WHOLE_NUMBER) {
        return new ElixirUnknownBaseWholeNumberImpl(node);
      }
      else if (type == UNQUALIFIED_NO_PARENTHESES_MANY_ARGUMENTS_CALL) {
        return new ElixirUnqualifiedNoParenthesesManyArgumentsCallImpl(node);
      }
      else if (type == VARIABLE) {
        return new ElixirVariableImpl(node);
      }
      else if (type == WHEN_INFIX_OPERATOR) {
        return new ElixirWhenInfixOperatorImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
