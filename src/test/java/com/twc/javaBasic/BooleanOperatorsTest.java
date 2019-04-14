package com.twc.javaBasic;

import com.twc.javaBasic.metadata.DifficultyLevel;
import com.twc.javaBasic.metadata.KnowledgePoint;
import com.twc.javaBasic.metadata.TestMetadata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BooleanOperatorsTest {
    @SuppressWarnings({"PointlessBooleanExpression", "ConstantConditions"})
    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_perform_logical_boolean_operations() {
        boolean[] actualResults = {
                true && true,
                true && false,
                false && false,
                true || true,
                true || false,
                false || false,
                true & true,
                true & false,
                false & false,
                true | true,
                true | false,
                false | false,
                3 == 7,
                4 != 5
        };

        // TODO:
        //  please write your answers directly. If you meet difficulties, please refer
        //  to page 62 of "Core Java Vol 1", section 3.5.6 and 3.5.7.
        // <--start
        boolean[] expectedResult = {};
        // --end-->

        assertArrayEquals(expectedResult, actualResults);
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_do_bitwise_and_boolean_operation() {
        final int value = 0x1234_abcd;
        final int mask = 0x000f_ff00;

        // TODO:
        //  please write your answers directly. If you meet difficulties, please refer
        //  to page 62 of "Core Java Vol 1", section 3.5.6 and 3.5.7.
        //  Please note that you should keep you answer in HEX mode.
        // <--start
        final int expected = 0;
        // --end-->

        assertEquals(expected, value & mask);
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_do_bitwise_or_boolean_operation() {
        final int value = 0x1234_0000;
        final int mask = 0x0000_abcd;

        // TODO:
        //  please write your answers directly. If you meet difficulties, please refer
        //  to page 62 of "Core Java Vol 1", section 3.5.6 and 3.5.7.
        //  Please note that you should keep you answer in HEX mode.
        // <--start
        final int expected = 0;
        // --end-->

        assertEquals(expected, value | mask);
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_do_bitwise_not_operation() {
        final int value = 0x0000_ffff;

        // TODO:
        //  please write your answers directly. If you meet difficulties, please refer
        //  to page 62 of "Core Java Vol 1", section 3.5.6 and 3.5.7.
        //  Please note that you should keep you answer in HEX mode.
        // <--start
        final int expected = 0;
        // --end-->

        assertEquals(expected, ~value);
    }
}
