package com.twc.javaBasic;

import com.twc.javaBasic.metadata.DifficultyLevel;
import com.twc.javaBasic.metadata.KnowledgePoint;
import com.twc.javaBasic.metadata.TestMetadata;
import com.twc.javaBasic.util.AnimeCharacter;
import com.twc.javaBasic.util.KeyValuePair;
import com.twc.javaBasic.util.ValueHolder;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StreamingTest {
    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_be_able_to_turn_collection_into_stream() {
        List<String> words = Arrays.asList("a", "quick", "brown", "fox", "jumps", "over");

        // TODO:
        //  Please use stream API to turn a List<String> into a Stream<String>.
        //  If you find it difficult, please check page 2 of "Core Java Vol 2",
        //  section 1.1.
        // <--start
        try (Stream<String> wordStream = null)
        // --end-->
        {
            assertIterableEquals(
                    words,
                    wordStream.collect(Collectors.toList())
            );
        }
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_be_able_to_turn_array_into_stream() {
        String[] words = {"a", "quick", "brown", "fox", "jumps", "over"};

        // TODO:
        //  please turn array into a stream.
        //  If you find it difficult, please check page 5 of "Core Java Vol 2",
        //  section 1.2.
        // <--start
        try (Stream<String> wordStream = null)
        // --end-->
        {
            assertArrayEquals(
                    words,
                    wordStream.toArray(String[]::new)
            );
        }
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_be_able_to_generate_empty_stream() {
        // TODO: please create an empty stream.
        //  If you find it difficult, please check page 5 of "Core Java Vol 2",
        //  section 1.2.
        // <--start
        try (Stream<String> emptyWordStream = null)
        // --end-->
        {
            assertEquals(0, emptyWordStream.count());
        }
    }

    @SuppressWarnings({"OptionalGetWithoutIsPresent"})
    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_be_able_to_generate_infinite_stream_with_same_items() {
        // TODO:
        //  please modify the following code to generate an infinite stream.
        //  If you find it difficult, please check page 5 of "Core Java Vol 2",
        //  section 1.1.
        // <--start
        try (Stream<String> infiniteEchos = null)
        // --end-->
        {
            assertEquals("Echo", infiniteEchos.skip(10000).findFirst().get());
        }
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_be_able_to_generate_infinite_stream_of_sequence() {
        // TODO:
        //  please modify the following code to generate an infinite sequence stream.
        //  If you find it difficult, please check page 5 of "Core Java Vol 2",
        //  section 1.1.
        // <--start
        try (Stream<Integer> infiniteSequence = null)
        // --end-->
        {
            Integer[] integers = infiniteSequence.limit(100).toArray(Integer[]::new);
            assertEquals(10, integers[10]);
            assertEquals(20, integers[20]);
        }
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.TWO_KNOWLEDGE_POINTS)
    void should_be_able_to_filter_stream() {
        Stream<String> wordStream = Stream.of("a", "quick", "brown", "fox", "jumps", "over");

        // TODO:
        //  please write code to filter word whose length is greater than 4.
        //  If you find it difficult, please check page 9 of "Core Java Vol 2",
        //  section 1.3.
        // <--start
        try (Stream<String> filtered = null)
        // --end-->
        {
            assertArrayEquals(new String[]{"quick", "brown", "jumps"}, filtered.toArray(String[]::new));
        }
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.TWO_KNOWLEDGE_POINTS)
    void should_be_able_to_map_stream() {
        Stream<String> wordStream = Stream.of("a", "quick", "brown", "fox", "jumps", "over");

        // TODO:
        //  please write code to filter word whose length is greater than 4
        //  If you find it difficult, please check page 9 of "Core Java Vol 2",
        //  section 1.3.
        // <--start
        try (Stream<String> filtered = null)
        // --end-->
        {
            assertArrayEquals(
                    new String[]{"A", "QUICK", "BROWN", "FOX", "JUMPS", "OVER"},
                    filtered.toArray(String[]::new));
        }
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.TWO_KNOWLEDGE_POINTS)
    void should_be_able_to_map_item_to_a_new_type() {
        Stream<String> nameStream = Stream.of("Naruto", "Kisuke", "Tomoya");

        // TODO:
        //  please use .map API to pass the test.
        //  If you find it difficult, please check page 9 of "Core Java Vol 2",
        //  section 1.3.
        // <--start
        try (Stream<AnimeCharacter> characters = null)
        // --end-->
        {
            AnimeCharacter[] actual = characters.toArray(AnimeCharacter[]::new);
            assertArrayEquals(
                    new AnimeCharacter[] {
                            new AnimeCharacter("Naruto"),
                            new AnimeCharacter("Kisuke"),
                            new AnimeCharacter("Tomoya")
                    },
                    actual);
        }
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.TWO_KNOWLEDGE_POINTS)
    void should_flatten_stream_of_streams() {
        Stream<Stream<Character>> nameStream = Stream
                .of("Naruto", "Kisuke", "Tomoya")
                .map(StreamingTest::letters);

        // TODO:
        //  please modify the following code to pass the test.
        //  If you find it difficult, please check page 9 of "Core Java Vol 2",
        //  section 1.3.
        // <--start
        try (Stream<Character> flatted = null)
        // --end-->
        {
            assertArrayEquals(
                    new Character[] {
                            'N', 'a', 'r', 'u', 't', 'o', 'K', 'i', 's', 'u', 'k',
                            'e', 'T', 'o', 'm', 'o', 'y', 'a'
                    },
                    flatted.toArray(Character[]::new));
        }
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_create_sequence_of_specified_size() {
        Stream<Integer> infiniteSequence = Stream.iterate(0, i -> i + 1);

        // TODO:
        //  please modify the following code to pass the test
        //  If you find it difficult, please check page 10 of "Core Java Vol 2",
        //  section 1.4.
        // <--start
        try (Stream<Integer> finiteStream = null)
        // --end-->
        {
            assertArrayEquals(
                    new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                    finiteStream.toArray(Integer[]::new)
            );
        }
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_concat_streams() {
        Stream<Character> helloStream = Stream.of('H', 'e', 'l', 'l', 'o');
        Stream<Character> worldStream = Stream.of('W', 'o', 'r', 'l', 'd');

        // TODO:
        //  please modify the following code to pass the test.
        //  If you find it difficult, please check page 10 of "Core Java Vol 2",
        //  section 1.4.
        // <--start
        try (Stream<Character> concatStream = null)
        // --end-->
        {
            assertArrayEquals(
                    letters("HelloWorld").toArray(Character[]::new),
                    concatStream.toArray(Character[]::new)
            );
        }
    }

    @SuppressWarnings("SpellCheckingInspection")
    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_get_unique_items() {
        Stream<Character> characterStream = letters("aquickbrownfox");

        // TODO: please modify the following code to pass the test
        //  If you find it difficult, please check page 11 of "Core Java Vol 2",
        //  section 1.5.
        // <--start
        try (Stream<Character> distinct = null)
        // --end-->
        {
            Character[] characters = distinct.sorted().toArray(Character[]::new);

            assertArrayEquals(
                    new Character[] {'a', 'b', 'c', 'f', 'i', 'k', 'n', 'o', 'q', 'r', 'u', 'w', 'x'},
                    characters
            );
        }
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.TWO_KNOWLEDGE_POINTS)
    void should_hook_stream_generation() {
        ValueHolder<Integer> holder = new ValueHolder<>();
        holder.setValue(0);

        Stream<Integer> hookStream = Stream
                .iterate(0, i -> i + 1)
                .limit(20)
                .filter(v -> v % 2 == 0)
                .peek(v -> holder.setValue(holder.getValue() + v));

        hookStream.forEach(i -> {});

        // TODO: please modify the following code to pass the test
        //  If you find it difficult, please check page 11 of "Core Java Vol 2",
        //  section 1.5.
        // <--start
        final int expected = Integer.MAX_VALUE;
        // --end-->

        assertEquals(expected, holder.getValue().intValue());
    }

    @SuppressWarnings({"unchecked"})
    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_throws_if_get_value_of_empty_optional() {
        // TODO:
        //  please create an empty optional and specify the concrete exception type.
        //  If you find it difficult, please check page 13 of "Core Java Vol 2",
        //  section 1.7.
        // <--start
        Optional<String> empty = null;
        Class errorType = null;
        // --end-->

        assertThrows(errorType, empty::get);
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_provide_a_default_value_using_or_else() {
        Optional<String> empty = Optional.empty();
        Optional<String> nonEmpty = Optional.of("great");

        // Hint: please implement getValue() method in this class.
        String emptyResult = getValue(empty, "default value");
        String nonEmptyResult = getValue(nonEmpty, "default value");

        assertEquals("default value", emptyResult);
        assertEquals("great", nonEmptyResult);
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_be_able_to_throw_for_empty_optional() {
        Optional<String> empty = Optional.empty();

        // TODO: please modify the following code to pass the test
        //  We would like to throw IllegalStateException when Optional is empty.
        //  If you find it difficult, please check page 13 of "Core Java Vol 2",
        //  section 1.7.
        // <--start
        Runnable emptyRunnable = () -> empty.get();
        // --end-->

        assertThrows(IllegalStateException.class, emptyRunnable::run);
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_process_value_if_present() {
        Optional<String> optional = Optional.of("word");
        List<String> result = new ArrayList<>();

        // TODO:
        //  in the consumer please map the optional value to upper case then add it into
        //  the result list.
        //  If you find it difficult, please check page 13 of "Core Java Vol 2",
        //  section 1.7.
        // <--start
        Consumer<Optional<String>> optionalConsumer = null;
        // --end-->

        optionalConsumer.accept(optional);

        assertEquals("WORD", result.get(0));
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.TWO_KNOWLEDGE_POINTS)
    void should_map_value_if_present() {
        Optional<String> optional = Optional.of("word");
        Optional<String> empty = Optional.empty();

        List<String> result = new ArrayList<>();

        // TODO:
        //  In this function. Please map the value of Optional<String> to uppercase. Then
        //  add mapped result to the result collection. If the Optional<String> is empty
        //  then nothing is done.
        //  If you find it difficult, please check page 13 of "Core Java Vol 2",
        //  section 1.7.
        // <--start
        Function<Optional<String>, Optional<Boolean>> mapping = null;
        // --end-->

        Optional<Boolean> mappingResult = mapping.apply(optional);
        Optional<Boolean> emptyMappingResult = mapping.apply(empty);

        assertTrue(mappingResult.orElseThrow(IllegalStateException::new));
        assertEquals("WORD", result.get(0));
        assertFalse(emptyMappingResult.isPresent());
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.TWO_KNOWLEDGE_POINTS)
    void should_flat_map_optional_value_do_chain_method() {
        Stream<YieldOptional> emptyStream = Stream.of(1, 2, 3)
                .filter(i -> i > 4)
                .map(i -> new YieldOptional());
        Stream<YieldOptional> nonEmptyStream = Stream.of(1, 2, 3)
                .filter(i -> i > 1)
                .map(i -> new YieldOptional());

        // TODO:
        //  In the following function. We would like to find the first value from the
        //  Stream<YieldOptional>. If it exists, then the function should return the
        //  value got by YieldOptional::get method.
        //  If it does not exist, then the function will return empty Optional<>.
        //  If you find it difficult, please check page 13 of "Core Java Vol 2",
        //  section 1.7.
        // <--start
        Function<Stream<YieldOptional>, Optional<String>> findFirstAndGet = null;
        // --end-->

        Optional<String> emptyStreamResult = findFirstAndGet.apply(emptyStream);
        Optional<String> nonEmptyStreamResult = findFirstAndGet.apply(nonEmptyStream);

        assertFalse(emptyStreamResult.isPresent());
        assertTrue(nonEmptyStreamResult.isPresent());
        assertEquals("Hello", nonEmptyStreamResult.get());
    }

    @Test
    @TestMetadata(value = DifficultyLevel.MEDIUM, kp = KnowledgePoint.MULTIPLE_CROSS_CATEGORY)
    void should_collect_result() {
        Stream<String> stream = Stream.of("Hello", "What", "is", "your", "name");

        // TODO:
        //  please implement toList collector using `stream.collect`. You cannot use
        //  existing `toList` collector. You have to use the raw Collector.of() method.
        //  If you find it difficult, please check the following document:
        //  https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collector.html#of-java.util.function.Supplier-java.util.function.BiConsumer-java.util.function.BinaryOperator-java.util.stream.Collector.Characteristics...-
        //  Please also refer to the samples at the beginning of the document.
        // <--start
        ArrayList<String> list = stream.collect(Collector.of(
            () -> null,
            (arrayList, item) -> {},
            (arr1, arr2) -> null
        ));
        // --end-->

        assertEquals(ArrayList.class, list.getClass());
        assertIterableEquals(
                Arrays.asList("Hello", "What", "is", "your", "name"),
                list
        );
    }

    @Test
    @TestMetadata(value = DifficultyLevel.MEDIUM, kp = KnowledgePoint.MULTIPLE_CROSS_CATEGORY)
    void should_collect_to_map() {
        Stream<KeyValuePair<String, Integer>> stream = Stream.of(
                new KeyValuePair<>("Harry", 2002),
                new KeyValuePair<>("Bob", 2014),
                new KeyValuePair<>("Harry", 2033)
        ).parallel();

        // TODO:
        //  please implement toMap collector using `stream.collect`. You cannot use
        //  existing `toMap` collector.
        //  If you find it difficult, please check the following document:
        //  https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collector.html#of-java.util.function.Supplier-java.util.function.BiConsumer-java.util.function.BinaryOperator-java.util.stream.Collector.Characteristics...-
        //  Please also refer to the samples at the beginning of the document.
        // <--start
        HashMap<String, Integer> map = stream.collect(
            Collector.of(
                () -> null,
                (tempMap, kv) -> {},
                (map1, map2) -> null
            )
        );
        // --end-->

        assertEquals(2, map.size());
        assertTrue(map.containsKey("Harry"));
        assertEquals(2033, map.get("Harry").intValue());
        assertTrue(map.containsKey("Bob"));
        assertEquals(2014, map.get("Bob").intValue());
    }

    @Test
    @TestMetadata(value = DifficultyLevel.MEDIUM, kp = KnowledgePoint.MULTIPLE_CROSS_CATEGORY)
    void should_collect_to_group() {
        Stream<KeyValuePair<String, Integer>> stream = Stream.of(
                new KeyValuePair<>("Harry", 2002),
                new KeyValuePair<>("Bob", 2014),
                new KeyValuePair<>("Harry", 2033)
        ).parallel();

        // TODO:
        //  implement grouping collector using `stream.collect`. You cannot use existing
        //  `groupingBy` collector. I will not write template code this time. Please refer
        //  to the last 2 tests.
        //  If you find it difficult, please check the following document:
        //  https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collector.html#of-java.util.function.Supplier-java.util.function.BiConsumer-java.util.function.BinaryOperator-java.util.stream.Collector.Characteristics...-
        //  Please also refer to the samples at the beginning of the document.
        // <--start
        HashMap<String, List<Integer>> map = null;
        // --end-->

        assertEquals(2, map.size());
        assertIterableEquals(Arrays.asList(2002, 2033), map.get("Harry"));
        assertIterableEquals(Collections.singletonList(2014), map.get("Bob"));
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_collect_to_group_continued() {
        Stream<KeyValuePair<String, Integer>> stream = Stream.of(
                new KeyValuePair<>("Harry", 2002),
                new KeyValuePair<>("Bob", 2014),
                new KeyValuePair<>("Harry", 2033)
        ).parallel();

        // TODO:
        //  implement grouping collector using `stream.collect`. This time please
        //  use `Collectors.groupingBy`.
        //  If you find it difficult, Please check page 28 of "Core Java Vol 2",
        //  section 1.10.
        // <--start
        Map<String, List<Integer>> map = null;
        // --end-->

        assertEquals(2, map.size());
        assertIterableEquals(Arrays.asList(2002, 2033), map.get("Harry"));
        assertIterableEquals(Collections.singletonList(2014), map.get("Bob"));
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_calculate_number_in_each_group() {
        Stream<KeyValuePair<String, Integer>> stream = Stream.of(
                new KeyValuePair<>("Harry", 2002),
                new KeyValuePair<>("Bob", 2014),
                new KeyValuePair<>("Harry", 2033)
        ).parallel();

        // TODO:
        //  implement grouping collector using `stream.collect`. You should use
        //  `Collectors.groupingBy`.
        //  If you find it difficult, Please check page 28 of "Core Java Vol 2",
        //  section 1.11.
        // <--start
        Map<String, Long> map = null;
        // --end-->

        assertEquals(2, map.size());
        assertEquals(2, map.get("Harry").longValue());
        assertEquals(1, map.get("Bob").longValue());
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_calculate_sum_of_each_group() {
        Stream<KeyValuePair<String, Integer>> stream = Stream.of(
                new KeyValuePair<>("Harry", 2002),
                new KeyValuePair<>("Bob", 2014),
                new KeyValuePair<>("Harry", 2033)
        ).parallel();

        // TODO:
        //  implement grouping collector using `stream.collect`. You should use
        //  `Collectors.groupingBy`
        //  If you find it difficult, Please check page 28 of "Core Java Vol 2",
        //  section 1.11.
        // <--start
        Map<String, Integer> map = null;
        // --end-->

        assertEquals(2, map.size());
        assertEquals(4035, map.get("Harry").intValue());
        assertEquals(2014, map.get("Bob").intValue());
    }

    @SuppressWarnings({"Convert2MethodRef", "OptionalGetWithoutIsPresent"})
    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_calculate_sum_using_reduce() {
        List<Integer> numbers = new ArrayList<>();
        Stream
                .iterate(1, i -> i + 1)
                .limit(100)
                .forEach(numbers::add);

        // TODO:
        //  please modify the following code to pass the test. You should use `reduce`
        //  streaming API.
        //  If you find it difficult, Please check page 33 of "Core Java Vol 2",
        //  section 1.12.
        // <--start
        Optional<Integer> reduced = null;
        // --end-->

        assertEquals(5050, reduced.get().intValue());
    }

    @SuppressWarnings("Convert2MethodRef")
    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_calculate_total_character_lengths() {
        List<String> words = Arrays.asList("The", "future", "is", "ours");

        // TODO:
        //  please calculate the total number of characters using `reduce`.
        //  If you find it difficult, Please check page 33 of "Core Java Vol 2",
        //  section 1.12.
        // <--start
        Integer total = null;
        // --end-->

        assertEquals(15, total.intValue());
    }

    @SuppressWarnings({"SameParameterValue", "OptionalUsedAsFieldOrParameterType"})
    private static <T> T getValue(Optional<T> optional, T defaultValue) {
        // TODO: please implement the following method to pass the test
        // <--start
        throw new RuntimeException("Not implemented");
        // --end-->
    }

    private static Stream<Character> letters(String text) {
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < text.length(); ++i) {
            characters.add(text.charAt(i));
        }
        return characters.stream();
    }
}

class YieldOptional {
    Optional<String> get() {
        return Optional.of("Hello");
    }
}
