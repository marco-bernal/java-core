package com.mab.core.bootcamp.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RandomNumbersArrayGeneratorTest {

    private RandomNumbersArrayGenerator randomNumbersArrayGenerator;
    @BeforeEach
    void setUp() {
        randomNumbersArrayGenerator = new RandomNumbersArrayGenerator();
    }

    @Test
    void printRandomNumbersArray() {
        //when
        randomNumbersArrayGenerator.printRandomNumbersArray(100, 10);

        //then
    }
}