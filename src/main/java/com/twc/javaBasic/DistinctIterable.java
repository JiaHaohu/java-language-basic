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
    //  please implements the following code to pass the test. If you find it
    //  difficult, please refer to page 463 of "Core Java Vol 1", section 9.1.3.
    //  and page 485, section 9.2.3.
    //  Note that the test will generate giga-bytes of duplicated data.
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
