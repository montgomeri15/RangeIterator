package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AppTest {

    /** Test Range class */
    @Test
    @DisplayName("Should have next in Range")
    void testRangeHasNext() {
        Range range = new Range(1, 5);

        assertThat(range.iterator().hasNext()).isNotNull()
                .isEqualTo(true);
    }

    @Test
    @DisplayName("Shouldn't have next in Range")
    void testRangeHasntNext() {
        Range range = new Range(1, 0);
        NoSuchElementException thrown = assertThrows(
                NoSuchElementException.class, () -> range.iterator().next(),
                "Expected next() to throw, but it didn't"
        );

        assertThat(range.iterator().hasNext()).isEqualTo(false);
        assertThat(thrown).isNotNull();
    }

    @Test
    @DisplayName("Shouldn't have remove method in Range")
    void testRangeRemoveMethod() {
        Range range = new Range(1, 5);
        UnsupportedOperationException thrown = assertThrows(
                UnsupportedOperationException.class, () -> range.iterator().remove(),
                "Expected remove() to throw, but it didn't"
        );

        assertThat(thrown).isNotNull();
    }

    /** Test RangeWithStep class */
    @Test
    @DisplayName("Should have next in RangeWithStep")
    void testRangeWithStepHasNext() {
        RangeWithStep rangeWithStep = new RangeWithStep(1, 5, 1);

        assertThat(rangeWithStep.iterator().hasNext()).isNotNull()
                .isEqualTo(true);
    }

    @Test
    @DisplayName("Shouldn't have next in RangeWithStep")
    void testRangeWithStepHasntNext() {
        RangeWithStep rangeWithStep = new RangeWithStep(1, 0, 1);
        NoSuchElementException thrown = assertThrows(
                NoSuchElementException.class, () -> rangeWithStep.iterator().next(),
                "Expected next() to throw, but it didn't"
        );

        assertThat(rangeWithStep.iterator().hasNext()).isEqualTo(false);
        assertThat(thrown).isNotNull();
    }

    @Test
    @DisplayName("Shouldn't have remove method in RangeWithStep")
    void testRangeWithStepRemoveMethod() {
        RangeWithStep rangeWithStep = new RangeWithStep(1, 5, 1);
        UnsupportedOperationException thrown = assertThrows(
                UnsupportedOperationException.class, () -> rangeWithStep.iterator().remove(),
                "Expected remove() to throw, but it didn't"
        );

        assertThat(thrown).isNotNull();
    }
}
