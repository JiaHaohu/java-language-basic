package com.twc.javaBasic;

import com.twc.javaBasic.util.RandomCharacterIterable;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class CollectionsTest {
    // Recommended time used: 15 min

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
