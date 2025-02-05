package com.mab.core.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReduceOperatorTest {

    private ReduceOperator reduceOperator;

    @BeforeEach
    void setUp() {
        reduceOperator = new ReduceOperator();
    }

    @Test
    void getArraySum() {
        //given
        int[] values = {23, 45, 1, 5, 3, 86, 13, 52};

        //when
        int result = reduceOperator.getArraySum(values);

        //then
        assertThat(result).isEqualTo(228);
    }
}