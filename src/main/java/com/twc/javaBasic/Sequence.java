package com.twc.javaBasic;

import java.util.Iterator;

public class Sequence implements Iterable<Integer> {
    private final Integer start;
    private final Integer end;

    public Sequence(Integer start, Integer end) {
        if (start >= end) { throw new IllegalArgumentException("Start must be smaller than End."); }
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new SequenceIterator(start, end);
    }
}

class SequenceIterator implements Iterator<Integer> {
    private Integer current;
    private final Integer end;

    SequenceIterator(Integer start, Integer end) {
        // TODO:
        //  please implements the following code to pass the test.
        //
        // Hint:
        //  If you find it difficult, please refer to page 463 of "Core Java Vol 1", section 9.1.3.
        // <--start
        throw new RuntimeException("Not implemented");
        // --end-->
    }

    @Override
    public boolean hasNext() {
        // TODO:
        //  please implements the following code to pass the test.
        //
        // Hint:
        //  If you find it difficult, please refer to page 463 of "Core Java Vol 1", section 9.1.3.
        // <--start
        throw new RuntimeException("Not implemented");
        // --end-->
    }

    @Override
    public Integer next() {
        // TODO:
        //  please implements the following code to pass the test.
        //
        // Hint:
        //  If you find it difficult, please refer to page 463 of "Core Java Vol 1", section 9.1.3.
        // <--start
        throw new RuntimeException("Not implemented");
        // --end-->
    }
}
