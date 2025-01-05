package com.mab.core.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class DistinctNumbersTest {

    private DistinctNumbers distinctNumbers;

    @BeforeEach
    void setUp() {
        distinctNumbers = new DistinctNumbers();
    }

    @Test
    void removeDuplicatesDistinct() {
        //given
        var numbers = Stream.of(1,1,2,3,3,4,4,4,5,5,5,6,6,7,7,8,8,8,8,8,9,9).toList();

        //when
        var numbersClean = distinctNumbers.removeDuplicatesDistinct(numbers);

        //then
        assertThat(numbersClean).containsExactly(1,2,3,4,5,6,7,8,9);
    }

    @Test
    void removeDuplicatesSet() {
        //given
        var numbers = Stream.of(1,1,2,3,3,4,4,4,5,5,5,6,6,7,7,8,8,8,8,8,9,9).toList();

        //when
        var numbersClean = distinctNumbers.removeDuplicatesSet(numbers);

        //then
        assertThat(numbersClean).containsExactly(1,2,3,4,5,6,7,8,9);
    }
}