package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RangeWithStep implements Iterable<Integer> {
    private final int start, end, step;

    public RangeWithStep(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public Iterator<Integer> iterator() {
        return new RangeIteratorWithStep();
    }

    private class RangeIteratorWithStep implements Iterator<Integer> {
        private int cursor;

        public RangeIteratorWithStep() {
            this.cursor = RangeWithStep.this.start;
        }

        @Override
        public boolean hasNext() {
            return this.cursor <= RangeWithStep.this.end;
        }

        @Override
        public Integer next() {
            if(hasNext()) {
                int nextInt = cursor;
                cursor += step;
                return nextInt;
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
