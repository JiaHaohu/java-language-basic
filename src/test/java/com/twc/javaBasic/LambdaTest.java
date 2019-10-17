package com.twc.javaBasic;

import com.twc.javaBasic.util.GenericFunc;
import com.twc.javaBasic.util.StringFunc;
import com.twc.javaBasic.util.ThisInClosure;
import com.twc.javaBasic.util.ValueHolder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LambdaTest {
    @Test
    void should_apply_to_interface_with_single_abstract_method() {
        StringFunc lambda = () -> "Hello";

        // TODO:
        //  You should write down the answer directly. For reference, please
        //  check page 315 of "Core Java Vol 1", section 6.3.2.
        // <--start
        final String expect = "";
        // --end-->

        assertEquals(expect, lambda.getString());
    }

    @Test
    void should_be_able_to_bind_to_instance_method() {
        // TODO:
        //  please bind lambda to `instanceMethod()` in this class.
        //  For reference please check page 319 of "Core Java Vol 1", section 6.3.4.
        // <--start
        StringFunc lambda = null;
        // --end-->

        assertEquals("instanceMethod", lambda.getString());
    }

    @Test
    void should_be_able_to_bind_to_static_method() {
        // TODO: please bind lambda to `staticMethod()` in this class.
        //  For reference please check page 319 of "Core Java Vol 1", section 6.3.4.
        // <--start
        StringFunc lambda = null;
        // --end-->

        assertEquals("staticMethod", lambda.getString());
    }

    @Test
    void should_bind_to_constructor() {
        // TODO:
        //  please bind lambda to constructor of ArrayList<Integer>.
        //  For reference please check page 321 of "Core Java Vol 1", section 6.3.5.
        // <--start
        GenericFunc<ArrayList<Integer>> lambda = null;
        // --end-->

        ArrayList<Integer> value = lambda.getValue();

        assertEquals(0, value.size());
    }

    @Test
    void should_capture_variable_in_a_closure() {
        int captured = 5;

        StringFunc lambda = () -> captured + " has been captured.";

        final String message = lambda.getString();

        // TODO:
        //  Please write down the answer directly.
        //  For reference please check page 322 of "Core Java Vol 1", section 6.3.6.
        // <--start
        final String expected = "";
        // --end-->

        assertEquals(expected, message);
    }

    @Test
    void should_evaluate_captured_variable_when_executing() {
        ValueHolder<String> value = new ValueHolder<>();
        value.setValue("I am the King of the world!");

        StringFunc lambda = () -> "The length of captured value is: " + value.getValue().length();

        // TODO:
        //  please write down the expected string directly.
        //  For reference please check page 322 of "Core Java Vol 1", section 6.3.6. and
        //  section 6.3.7.
        // <--start
        final String expected = "";
        // --end-->

        value.setValue("Blah");
        assertEquals(expected, lambda.getString());
    }

    @Test
    void should_extend_variable_scope() {
        StringFunc stringFunc = returnLambda();
        String message = stringFunc.getString();

        // TODO:
        //  please write down the expected string directly.
        //  For reference please check page 322 of "Core Java Vol 1", section 6.3.6.
        // <--start
        final String expected = "";
        // --end-->

        assertEquals(expected, message);
    }

    @Test
    void should_capture_this_variable() {
        ThisInClosure instance = new ThisInClosure();
        StringFunc stringFunc = instance.getLambda();

        // TODO: please write down the expected string directly.
        // <--start
        final String expected = "";
        // --end-->

        assertEquals(expected, stringFunc.getString());
    }

    private static StringFunc returnLambda() {
        int year = 2019;
        return () -> "In the year " + year;
    }

    private static String staticMethod() {
        return "staticMethod";
    }

    private String instanceMethod() {
        return "instanceMethod";
    }
}
