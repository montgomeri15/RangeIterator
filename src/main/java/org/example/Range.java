package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer> {
    private final int start, end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public Iterator<Integer> iterator() {
        return new RangeIterator();
    }

    //Inner RangeIterator class
    private class RangeIterator implements Iterator<Integer> {
        private int cursor;

        public RangeIterator() {
            this.cursor = Range.this.start;
        }

        @Override
        public boolean hasNext() {
            return this.cursor <= Range.this.end;
        }

        @Override
        public Integer next() {
            if(hasNext()) {
                return cursor++;
            } else {
                throw new NoSuchElementException();
            }
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
