package com.twc.javaBasic;

import com.twc.javaBasic.util.EscapedChars;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharTypeTest {
    @Test
    void should_describe_escaped_chars() {
        // TODO:
        //  Please write down the correct escaped characters.
        //
        // Hint:
        //  If you meet difficulties, please refer to page 50 of "Core Java Vol 1", section 3.3.3.
        // <-start--
        final char backspace = ' ';
        final char tab = ' ';
        final char lineFeed = ' ';
        final char carriageReturn = ' ';
        final char doubleQuote = ' ';
        final char singleQuote = ' ';
        final char backslash = ' ';
        // --end-->

        assertEquals(EscapedChars.BACKSPACE.getValue(), backspace);
        assertEquals(EscapedChars.TAB.getValue(), tab);
        assertEquals(EscapedChars.LINE_FEED.getValue(), lineFeed);
        assertEquals(EscapedChars.CARRIAGE_RETURN.getValue(), carriageReturn);
        assertEquals(EscapedChars.DOUBLE_QUOTE.getValue(), doubleQuote);
        assertEquals(EscapedChars.SINGLE_QUOTE.getValue(), singleQuote);
        assertEquals(EscapedChars.BACKSLASH.getValue(), backslash);
    }
}
