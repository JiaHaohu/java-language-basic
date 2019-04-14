package com.twc.javaBasic;

import com.twc.javaBasic.metadata.DifficultyLevel;
import com.twc.javaBasic.metadata.KnowledgePoint;
import com.twc.javaBasic.metadata.TestMetadata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloatingTypeTest {
    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_not_get_rounded_result_if_convert_floating_number_to_integer() {
        final float floatingPointNumber = 2.75f;
        final int integer = (int)floatingPointNumber;

        // TODO:
        //  Please write down the answer directly. If you find it difficult, please
        //  check page 60 of "Core Java Vol 1", section 3.5.3.
        // <!--start
        final int expected = Integer.MAX_VALUE;
        // --end-->

        assertEquals(expected, integer);
    }

    @SuppressWarnings({"divzero", "NumericOverflow"})
    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_judge_special_double_cases() {
        // Hint, please implement isInfinity and isNan in this class.
        assertTrue(isInfinity(1d / 0d));
        assertTrue(isInfinity(-1d / 0d));
        assertFalse(isInfinity(2d));
        assertFalse(isInfinity(Double.NaN));

        assertTrue(isNan(0d / 0d));
        assertFalse(isNan(Double.NEGATIVE_INFINITY));
        assertFalse(isNan(Double.POSITIVE_INFINITY));
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_not_round_number_when_convert_to_integer() {
        final float floatingPointNumber = 2.75f;
        final int integer = (int)floatingPointNumber;

        // TODO:
        //  Please write down you answer directly. If you find it difficult, please
        //  check page 60 of "Core Java Vol 1", section 3.5.3.
        // <!--start
        final int expected = Integer.MAX_VALUE;
        // --end-->

        assertEquals(expected, integer);
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_round_number() {
        final double floatingPointNumber = 2.75;

        // TODO:
        //  Please call some method to round the floating point number. Okay, the
        //  reference is here:
        //  https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-
        // <!--start
        final long rounded = Long.MAX_VALUE;
        // --end-->

        assertEquals(3L, rounded);
    }

    @SuppressWarnings("unused")
    private boolean isNan(double realNumber) {
        // TODO:
        //  please implement the method to pass the test. It is better you call existing
        //  API rather than implemented yourself.
        throw new RuntimeException("Not implemented");
    }

    @SuppressWarnings("unused")
    private boolean isInfinity(double realNumber) {
        // TODO:
        //  please implement the method to pass the test. It is better you call existing
        //  API rather than implemented yourself.
        throw new RuntimeException("Not implemented");
    }
}
