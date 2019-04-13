package com.twc.javaBasic;

import com.twc.javaBasic.util.Employee;
import com.twc.javaBasic.util.KeyValuePair;
import com.twc.javaBasic.util.Manager;
import com.twc.javaBasic.util.Pair;
import org.junit.jupiter.api.Test;

import javax.swing.text.html.Option;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenericTest {
    @Test
    void should_auto_resolve_generic_method() {
        final String[] words = {"Hello", "Good", "Morning"};

        // TODO:
        //   The getMiddle method is a generic method. Now, please call getMiddle
        //   method for string type.
        // <--start
        final String middle = null;
        // --end-->

        assertEquals("Good", middle);
    }

    @Test
    void should_specify_a_type_restriction_on_typed_parameters() {
        // Hint: please implement the min() method in this class.
        int minimumInteger = min(new Integer[]{1, 2, 3});
        double minimumReal = min(new Double[]{1.2, 2.2, -1d});

        assertEquals(1, minimumInteger);
        assertEquals(-1d, minimumReal, 1.0E-05);
    }

    @Test
    void should_not_know_generic_type_parameters_at_runtime() {
        KeyValuePair<String, Integer> pair = new KeyValuePair<>("name", 2);
        KeyValuePair<Integer, String> pairWithDifferentTypeParameter = new KeyValuePair<>(2, "name");

        // TODO:
        //  Please write your answer directly. If you find it difficult. Please check
        //  page 425 of "Core Java Vol 1", section 8.5.1.
        // <--start
        final Optional<Boolean> expected = Optional.empty();
        // --end-->

        assertEquals(expected.get(), pair.getClass().equals(pairWithDifferentTypeParameter.getClass()));
    }

    @SuppressWarnings({"UnnecessaryLocalVariable", "unchecked", "unused"})
    @Test
    void should_be_careful_of_raw_type_generic() {
        Pair<Manager> managerPair = new Pair<>();
        Pair rawPair = managerPair;
        rawPair.setFirst(new Employee());

        boolean willThrow = false;
        try {
            Manager first = managerPair.getFirst();
        } catch (ClassCastException error) {
            willThrow = true;
        }

        // TODO:
        //  Please write down your answer directly. If you find it difficult. Please check
        //  page 425 of "Core Java Vol 1", section 8.5.1.
        // <--start
        final Optional<Boolean> expected = Optional.empty();
        // --end-->

        assertEquals(expected.get(), willThrow);
    }

    @Test
    void should_swap() {
        Pair<String> pair = new Pair<>("Hello", "World");

        // Hint: please implement swap() method in this class.
        swap(pair);

        assertEquals("World", pair.getFirst());
        assertEquals("Hello", pair.getSecond());
    }

    private static <T> T getMiddle(T[] args) {
        return args[args.length / 2];
    }

    // TODO:
    //  please implement the following code to pass the test. It should be generic
    //  after all. The method should only accept `Number` and the number should
    //  implement `Comparable<T>`.
    //  You should not change the signature of the function. But you can change
    //  the declaration of the generic type parameter.
    // <--start
    private static <T> T min(T[] values) {
        throw new RuntimeException("Not implemented");
    }
    // --end-->

    // TODO:
    //  please implement following method to pass the test. The method should be able
    //  to swap fields in a pair. But you cannot change the signature of the function.
    //  If you find it difficult, please check page 448 of "Core Java Vol 1", section
    //  8.8.4.
    // <--start
    private static void swap(Pair<?> pair) {
        throw new RuntimeException("Not implemented");
    }

    // TODO: You can add additional method within the range if you like

    // --end-->
}
