package org.elixir_lang.parser_definition;

/**
 * Created by luke.imhoff on 8/3/14.
 */
public class EmptyParenthesesExpressionParsingTestCase extends ParsingTestCase {
    public void testHatOperation() {
        assertParsedAndQuotedCorrectly();
    }

    @Override
    protected String getTestDataPath() {
        return super.getTestDataPath() + "/empty_parentheses_expression_parsing_test_case";
    }
}
