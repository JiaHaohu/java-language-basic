package com.twc.javaBasic;

import com.twc.javaBasic.util.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ObjectTest {
    @SuppressWarnings({"UnnecessaryLocalVariable", "ConstantConditions"})
    @Test
    void should_point_to_the_same_object() {
        Object objectReference = new Object();
        Object sameReference = objectReference;

        final boolean referenceToSameObject = objectReference == sameReference;

        // SUPER_TODO:
        //  Please write down your answer directly.
        // <--start
        final Optional<Boolean> expected = Optional.empty();
        // --end-->

        assertEquals(expected.get(), referenceToSameObject);
    }

    @SuppressWarnings("NewObjectEquality")
    @Test
    void should_point_to_different_object() {
        LocalDate goodDay = LocalDate.of(2018, 5, 10);
        LocalDate sameDay = LocalDate.of(2018, 5, 10);

        final boolean referenceToSameObject = goodDay == sameDay;

        // SUPER_TODO:
        //  Please write down your answer directly.
        // <--start
        final Optional<Boolean> expected = Optional.empty();
        // --end-->

        assertEquals(expected.get(), referenceToSameObject);
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    void should_initialized_to_default_value() {
        FieldNotExplicitlyInitialized instance = new FieldNotExplicitlyInitialized();

        // SUPER_TODO:
        //  Please write down your answer directly.
        //
        // Hint
        //  If you find it difficult, please check page 172 of "Core Java Vol 1", section 4.6.2.
        // <--start
        final String expectedName = "expected";
        final int expectedYearOfBirth = Integer.MAX_VALUE;
        final LocalDate expectedRegisteredDate = LocalDate.now();
        // --end-->

        assertEquals(expectedName, instance.getName());
        assertEquals(expectedYearOfBirth, instance.getYearOfBirth());
        assertEquals(expectedRegisteredDate, instance.getRegisteredDate());
    }

    @Test
    void should_pass_by_value() {
        int value = 5;

        tryingToUpdateValue(value);

        // SUPER_TODO:
        //  Please write down your answer directly.
        //
        // Hint
        //  If you find it difficult, please check page 164 of "Core Java Vol 1", section 4.5.
        // <--start
        final int expected = Integer.MAX_VALUE;
        // --end-->

        assertEquals(expected, value);
    }

    @SuppressWarnings("UnusedAssignment")
    private static void tryingToUpdateValue(int value) {
        value += 2;
    }

    @SuppressWarnings({"UnnecessaryLocalVariable", "unused"})
    @Test
    void should_pass_by_value_continued() {
        Object objectReference = new Object();
        final Object sameReference = objectReference;

        Object instanceCreatedByMethod = tryingToUpdateReference(objectReference);

        // SUPER_TODO:
        //  Please write down your answer directly. You can only choose from
        //  `sameReference` and `instanceCreatedByMethod`.
        //
        // Hint
        //  If you find it difficult, please check page 164 of "Core Java Vol 1", section 4.5.
        // <--start
        final Object expected = new Object();
        // --end-->

        assertEquals(expected, objectReference);
    }

    @Test
    void should_modify_internal_state() {
        SimpleObjectWithInternalState instance = new SimpleObjectWithInternalState("Initial Name");

        tryingToUpdateState(instance);

        // SUPER_TODO:
        //  Please write down your answer directly.
        //
        // Hint
        //  If you find it difficult, please check page 164 of "Core Java Vol 1", section 4.5.
        // <--start
        final String expected = "";
        // --end-->

        assertEquals(expected, instance.getName());
    }

    @Test
    void should_choose_method_at_compile_time() {
        OverloadingFixture fixture = new OverloadingFixture();

        String actual = fixture.methodWithOneParameter((Object)"I am a string");

        // SUPER_TODO:
        //  Please write down your answer directly.
        //
        //  If you find it difficult, please check page 172 of "Core Java Vol 1", section 4.6.1.
        // <--start
        final String expected = "";
        // --end-->

        assertEquals(expected, actual);
    }

    @Test
    void should_choose_the_most_specific_overload() {
        OverloadingFixture fixture = new OverloadingFixture();
        final String name = "name";
        final int integer = 2;

        String actual = fixture.methodWithTwoParameters(name, integer);

        // SUPER_TODO:
        //  Please write down your answer directly.
        //
        // Hint
        //  If you find it difficult, please check page 172 of "Core Java Vol 1", section 4.6.1.
        // <--start
        final String expected = "";
        // --end-->

        assertEquals(expected, actual);
    }

    @Test
    void should_calling_another_constructor() {
        CallingAnotherCtor instance = new CallingAnotherCtor();

        // SUPER_TODO:
        //  Please write down your answer directly.
        //
        // Hint
        //  If you find it difficult, please check page 172 of "Core Java Vol 1", section 4.6.1.
        // <--start
        final String expected = "";
        // --end-->

        assertEquals(expected, instance.getName());
    }

    @SuppressWarnings("unused")
    @Test
    void should_get_initialization_ordering() {
        InitializationOrderClass.resetLogs();
        InitializationOrderClass instance = new InitializationOrderClass();
        String[] logs = InitializationOrderClass.getLogs();

        // SUPER_TODO:
        //  Please write down your answer directly.
        //
        // Hint
        //  If you find it difficult, please check page 172 of "Core Java Vol 1", section 4.6
        // <--start
        final String[] expected = {};
        // --end-->

        assertArrayEquals(expected, logs);
    }

    @Test
    void should_get_message_of_var_length_parameters() {
        final String message = getMessageOfVarLengthParameters(1, 2, 3);

        // SUPER_TODO:
        //  Please write down your answer directly.
        //
        // Hint:
        //  If you find it difficult, please check page 256 of "Core Java Vol 1", section 5.5.
        // <--start
        final String expected = "";
        // --end-->

        assertEquals(expected, message);
    }


    @SuppressWarnings("RedundantArrayCreation")
    @Test
    void should_get_message_of_var_length_parameters_2() {
        final String message = getMessageOfVarLengthParameters(new Object[] {1, 2, 3});

        // SUPER_TODO:
        //  Please write down your answer directly.
        //
        // Hint
        //  If you find it difficult, please check page 256 of "Core Java Vol 1", section 5.5.
        // <--start
        final String expected = "";
        // --end-->

        assertEquals(expected, message);
    }

    private static String getMessageOfVarLengthParameters(Object... args) {
        StringBuilder builder = new StringBuilder();
        for (Object arg : args) {
            builder.append(arg.toString()).append("\n");
        }

        return builder.toString();
    }

    private static void tryingToUpdateState(SimpleObjectWithInternalState instance) {
        instance.setName("Updated Name");
    }

    @SuppressWarnings("ParameterCanBeLocal")
    private static Object tryingToUpdateReference(Object object) {
        object = new Object();
        return object;
    }
}
