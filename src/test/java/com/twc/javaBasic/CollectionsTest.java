package com.twc.javaBasic;

import com.twc.javaBasic.util.RandomCharacterIterable;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class CollectionsTest {
    @Test
    void should_go_through_an_iterator() {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("Hello");
        collection.add("World");
        collection.add("!");
        Iterator<String> iterator = collection.iterator();

        // Hint: You should implement createList() in this class.
        assertIterableEquals(Arrays.asList("Hello", "World", "!"), createList(iterator));
    }

    @SuppressWarnings({"unused", "UnnecessaryLocalVariable"})
    private static List<String> createList(Iterator<String> iterator) {
        List<String> list = new ArrayList<>();

        // TODO:
        //  This function will create a list from an iterator. You could ONLY use
        //  `Iterator.hasNext` and `Iterator.next` API to copy items to a `List`.
        //  No `for` is allowed.
        //
        // Hint:
        //  If you meet difficulties, please refer to page 463 of "Core Java Vol 1",
        //  section 9.1.3.
        // <--start

        // --end-->

        return list;
    }

    @Test
    void should_create_a_sequence_without_putting_all_items_into_memory() {
        // Hint: please open Sequence.java
        Sequence sequence = new Sequence(4, 10);
        assertIterableEquals(Arrays.asList(4, 5, 6, 7, 8, 9), sequence);
    }

    @Test
    void should_predict_linked_list_operation_result() {
        LinkedList<String> staff = new LinkedList<>();

        staff.add("Amy");
        staff.add("Bob");
        staff.add("Carl");

        ListIterator<String> iterator = staff.listIterator();
        iterator.next();
        iterator.add("Juliet");
        iterator.previous();
        iterator.remove();

        // TODO:
        //  Please write your answer directly.
        //
        // Hint:
        //  If you meet difficulties, please refer to page 474 of "Core Java Vol 1", section 9.2.1.
        // <--start
        final List<String> expected = null;
        // --end-->

        assertIterableEquals(expected, staff);
    }

    @Test
    void should_generate_distinct_sequence_on_the_fly() {
        // NOTE: This test may execute for a while. But it is okay if your impl is correct.
        final int oneGagaChars = 1024 * 1024 * 1024;
        RandomCharacterIterable characters = new RandomCharacterIterable(
                oneGagaChars,
                new Character[]{'a', 'b'});

        // Hint: Please open DistinctIterable.java
        List<Character> distinct = new DistinctIterable<>(characters).toList();
        distinct.sort(Character::compareTo);

        assertIterableEquals(Arrays.asList('a', 'b'), distinct);
    }

    @Test
    void should_reflects_back_to_original_list_for_sub_range() {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 12; ++i) {
            integers.add(i);
        }

        List<Integer> subList = integers.subList(3, 10);
        subList.clear();

        // TODO:
        //  Please write down your answer directly.
        //
        // Hint:
        //  If you find it difficult, please refer to page 510 of "Core Java Vol 1", section 9.4.2.
        // <--start
        final List<Integer> expected = null;
        // --end-->

        assertIterableEquals(expected, integers);
    }
}
