package org.elixir_lang.parser_definition;

/**
 * Created by luke.imhoff on 9/17/14.
 */
public class AtomParsingTestCase extends ParsingTestCase {
    public void testDoubleQuoted() {
        doParsingAndQuoting();
    }

    public void testLiteral() {
        doParsingAndQuoting();
    }

    public void testOperator() {
        doParsingAndQuoting();
    }

    public void testSingleQuoted() {
        doParsingAndQuoting();
    }

    @Override
    protected String getTestDataPath() {
        return super.getTestDataPath() + "/atom_parsing_test_case";
    }
}
