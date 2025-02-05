package com.mab.core.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class FlatMapOperationsTest {

    private FlatMapOperations flatMapOperations;

    private final List<List<String>> mutableNames =
            Arrays.asList( // Arrays.asList -> Mutable.
                    Arrays.asList("Mariam", "Alex", "Ismail"),
                    Arrays.asList("John", "Alesha", "Andre"),
                    Arrays.asList("Susy", "Ali")
            );

    @BeforeEach
    void setUp() {
        flatMapOperations = new FlatMapOperations();
    }

    @Test
    void mergeMutableNames() {
        //when
        List<String> mergedList = flatMapOperations.mergeNamesMutable(mutableNames);
        mergedList.add("Necrocannibal");

        //then
        assertThat(mergedList).hasSize(9);
    }

    @Test
    void mergeImmutableNamesThrowsUnsupportedOperationException() {
        //when
        List<String> mergedList = flatMapOperations.mergeNamesImmutable(mutableNames);

        Throwable thrown = catchThrowable(
                () -> mergedList.add("Necrocannibal")
        );

        //then
        assertThat(thrown).isInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    void mergeImmutableNames() {
        //when
        List<String> mergedList = flatMapOperations.mergeNamesImmutable(mutableNames);

        //then
        assertThat(mergedList).hasSize(8);
    }
}