package com.mab.core.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MinAndMaxTest {

    private MinAndMax minAndMax;

    @BeforeEach
    void setUp() {
        minAndMax = new MinAndMax();
    }

    @Test
    void getMax() {
        //given
        List<Integer> values = Arrays.asList(2378, 4, 2, 34, 45, 456, 4956, 123, 1, 1652, 142, 172, 8723, 1823);

        //when
        Integer max = minAndMax.getMax(values);

        //then
        assertThat(max).isEqualTo(8723);
    }

    @Test
    void getMin() {
        //given
        List<Integer> values = Arrays.asList(2378, 4, 2, 34, 45, 456, 4956, 123, 1, 1652, 142, 172, 8723, 1823);

        //when
        Integer min = minAndMax.getMin(values);

        //then
        assertThat(min).isEqualTo(1);
    }
}