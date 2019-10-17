package com.twc.javaBasic;

import com.twc.javaBasic.util.ClosableStateReference;
import com.twc.javaBasic.util.ClosableWithException;
import com.twc.javaBasic.util.ClosableWithoutException;
import com.twc.javaBasic.util.MyClosableType;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionTest {
    @Test
    void should_customize_exception() {
        try {
            // Hint: please open StringFormatException.java
            throw new StringFormatException("the message");
        } catch (StringFormatException error) {
            assertEquals("the message", error.getMessage());
        }
    }

    @Test
    void should_customize_exception_continued() {
        Exception innerError = new Exception("inner error");

        try {
            // Hint: please open StringFormatException.java
            throw new StringFormatException("the message", innerError);
        } catch (StringFormatException error) {
            assertEquals("the message", error.getMessage());
            assertEquals(innerError, error.getCause());
        }
    }

    @Test
    void should_be_careful_of_the_order_of_finally_block() {
        int confusedResult = confuse(2);

        // SUPER_TODO:
        //  Please write down your answer directly.
        //
        // Hint:
        //  If you want some reference, please check page 372 of "Core Java Vol 1", section 7.2.4.
        // <--start
        final int expectedResult = Integer.MAX_VALUE;
        // --end-->

        assertEquals(expectedResult, confusedResult);
    }

    @Test
    void should_use_the_try_pattern() {
        ClosableStateReference closableStateReference = new ClosableStateReference();
        try (MyClosableType closable = new MyClosableType(closableStateReference))
        {
            assertFalse(closable.isClosed());
        }

        // SUPER_TODO:
        //  Please write down your answer directly.
        //
        // Hint:
        //  If you want some reference, please check page 376 of "Core Java Vol 1", section 7.2.5.
        // <--start
        final Optional<Boolean> expected = null;
        // --end-->

        assertEquals(expected.get(), closableStateReference.isClosed());
    }

    @SuppressWarnings({"EmptyTryBlock", "unused"})
    @Test
    void should_call_closing_even_if_exception_throws() throws Exception {
        ArrayList<String> logger = new ArrayList<>();

        try {
            try (AutoCloseable withoutThrow = new ClosableWithoutException(logger);
                 AutoCloseable withThrow = new ClosableWithException(logger)) {
            }
        } catch (Exception e) {
            // It is okay!
        }

        // SUPER_TODO:
        //  Please write down your answer directly.
        //
        // Hint:
        //  If you want some reference, please check page 376 of "Core Java Vol 1", section 7.2.5.
        // <--start
        final String[] expected = {};
        // --end-->

        assertArrayEquals(expected, logger.toArray());
    }

    @Test
    void should_get_method_name_in_stack_frame() {
        // Hint: please open `StackFrameHelper.java`.
        String methodName = StackFrameHelper.getCurrentMethodName();

        assertEquals(
                "com.twc.javaBasic.ExceptionTest.should_get_method_name_in_stack_frame",
                methodName);
    }

    @SuppressWarnings({"ReturnInsideFinallyBlock", "SameParameterValue"})
    private int confuse(int value) {
        try {
            return value * value;
        } finally {
            if (value == 2) {
                return 0;
            }
        }
    }
}
