package org.elixir_lang.parser_definition;

/**
 * Created by luke.imhoff on 8/3/14.
 */
public class HexadecimalWholeNumberParsingTestCase extends ParsingTestCase {
    public void testNoDigits() {
        assertParsedAndQuotedAroundError();
    }

    public void testObsoleteNoDigits() {
        doTest(true);
    }

    public void testObsoleteValid() {
        doTest(true);
    }

    public void testValid() {
        doTest(true);
    }

    @Override
    protected String getTestDataPath() {
        return super.getTestDataPath() + "/hexadecimal_whole_number_parsing_test_case";
    }
}
