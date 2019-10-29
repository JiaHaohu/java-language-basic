package com.twc.javaBasic;

import java.util.*;

public class DistinctIterable<T> implements Iterable<T> {
    private Iterable<T> iterable;

    public DistinctIterable(Iterable<T> iterable) {
        this.iterable = iterable;
    }

    @Override
    public Iterator<T> iterator() {
        return new DistinctIterator<>(iterable.iterator());
    }

    public List<T> toList() {
        ArrayList<T> result = new ArrayList<>();
        this.forEach(result::add);
        return result;
    }
}

class DistinctIterator<E> implements Iterator<E> {
    // TODO:
    //  please implements the following code to pass the test. Note that the test will generate
    //  giga-bytes of duplicated data. So please be aware that do not put lots of data into memory.
    //
    // Hint:
    //  (1) A well-known data structure for finding objects quickly is the hash table. Please
    //      refer to page 485, section 9.2.3.
    //  (2) For an instance of `Iterator` interface, by repeatedly calling the next method,
    //      you can visit the elements from the collection one by one. However, if you reach the
    //      end of the collection, the next method throws a `NoSuchElementException`. Therefore,
    //      you need to call the hasNext() method before calling next. Please refer to page 463 of
    //      "Core Java Vol 1", section 9.1.3.
    // <--start
    private final Iterator<E> iterator;

    DistinctIterator(Iterator<E> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasNext() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public E next() {
        throw new RuntimeException("Not implemented");
    }
    // --end->
}
