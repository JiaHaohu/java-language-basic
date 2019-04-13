package com.twc.javaBasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class IntegerTypeTest {
    @Test
    void should_get_range_of_primitive_int_type() {
        final int maximum = 0x7fffffff;
        final int minimum = 0x80000000;

        // TODO:
        //  You should not write concrete number here. Please find a property
        //  or constant instead. If you want some reference. Please see
        //  https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#MAX_VALUE
        //  If you want some overview for integer types, you can refer to page
        //  47 of "Core Java Vol 1".
        // <!--start
        final int maximumSymbol = 0;
        final int minimumSymbol = 0;
        // --end-->

        assertEquals(maximumSymbol, maximum);
        assertEquals(minimumSymbol, minimum);
    }

    @Test
    void should_get_range_of_primitive_short_type() {
        final short maximum = 32767;
        final short minimum = -32768;

        // TODO:
        //  You should not write concrete number here. Please find a property
        //  or constant instead.
        // <!--start
        final short maximumSymbol = 0;
        final short minimumSymbol = 0;
        // --end-->

        assertEquals(maximumSymbol, maximum);
        assertEquals(minimumSymbol, minimum);
    }

    @Test
    void should_get_range_of_primitive_long_type() {
        final long maximum = 0x7fffffffffffffffL;
        final long minimum = -0x8000000000000000L;

        // TODO:
        //  You should not write concrete number here. Please find a property or
        //  constant instead.
        // <!--start
        final long maximumSymbol = 0;
        final long minimumSymbol = 0;
        // --end-->

        assertEquals(maximumSymbol, maximum);
        assertEquals(minimumSymbol, minimum);
    }

    @Test
    void should_get_range_of_primitive_byte_type() {
        final byte maximum = 127;
        final byte minimum = -128;

        // TODO:
        //  You should not write concrete number here. Please find a property
        //  or constant instead.
        // <!--start
        final byte maximumSymbol = 0;
        final byte minimumSymbol = 0;
        // --end-->

        assertEquals(maximumSymbol, maximum);
        assertEquals(minimumSymbol, minimum);
    }

    @Test
    void should_overflow_silently() {
        int theNumberWillOverflow = Integer.MAX_VALUE;
        ++theNumberWillOverflow;

        // TODO:
        //  Please correct the value to pass the test. You should write the
        //  result directly.
        // <--start
        final int expectedResult = 0;
        // --end-->

        assertEquals(expectedResult, theNumberWillOverflow);
    }

    @Test
    void should_underflow_silently() {
        int theNumberWillUnderflow = Integer.MIN_VALUE;
        --theNumberWillUnderflow;

        // TODO:
        //  Please correct the value to pass the test. You should write the
        //  result directly.
        // <--start
        final int expectedResult = 0;
        // --end-->

        assertEquals(expectedResult, theNumberWillUnderflow);
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test
    void should_throw_exception_when_overflow() {
        int theNumberWillOverflow = Integer.MAX_VALUE;

        // Hint: you need to implement add() method in this class.
        assertThrows(ArithmeticException.class, () -> add(theNumberWillOverflow, 1));
    }

    @Test
    void just_prevent_lazy_implementation() {
        // Hint: you need to implement add() method in this class.
        assertEquals(3, add(1, 2));
    }

    @SuppressWarnings("PointlessArithmeticExpression")
    @Test
    void should_take_care_of_number_type_when_doing_calculation() {
        final double result1 = 2 / 3 * 5;
        final double result2 = 2 * 5 / 3;

        // TODO:
        //  please modify the following lines to pass the test. If you want some reference
        //  please see page 59 of "Core Java Vol 1", section 3.5.2.
        // <!--start
        final double expectedResult1 = Double.NaN;
        final double expectedResult2 = Double.NaN;
        // --end-->

        assertEquals(expectedResult1, result1, +1.0E-05);
        assertEquals(expectedResult2, result2, +1.0E-05);
    }

    @Test
    void should_truncate_number_when_casting() {
        final int integer = 0x0123_4567;
        final short smallerInteger = (short)integer;

        // TODO:
        //  please modify the following lines to pass the test. Please refer to page
        //  60 of "Core Java Vol 1", section 3.5.3.
        // <!--start
        final short expected = 0;
        // --end-->

        assertEquals(expected, smallerInteger);
    }

    @Test
    void should_increment() {
        int integer = 3;

        int result = integer++;

        // TODO:
        //  please modify the following code to pass the test. You should write the
        //  result directly.
        // <--start
        final int expectedCurrentInteger = 0;
        final int expectedResult = 0;
        // --end-->

        assertEquals(expectedCurrentInteger, integer);
        assertEquals(expectedResult, result);
    }

    @Test
    void should_increment_2() {
        int integer = 3;

        int result = ++integer;

        // TODO:
        //   please modify the following code to pass the test. You should write the
        //   result directly.
        // <--start
        final int expectedCurrentInteger = 0;
        final int expectedResult = 0;
        // --end-->

        assertEquals(expectedCurrentInteger, integer);
        assertEquals(expectedResult, result);
    }

    private int add(int left, int right) {
        // TODO:
        //  Please implement the method. Adding two numbers. This method should throw
        //  ArithmeticException if overflow or underflow happens.
        //  Hint: Java library contains method to do this. If you meet some difficulties
        //  here please refer to the following document:
        //  https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#addExact-int-int-
        throw new RuntimeException("Not implemented");
    }
}
