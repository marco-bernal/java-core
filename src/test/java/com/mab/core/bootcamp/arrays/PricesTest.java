package com.mab.core.bootcamp.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PricesTest {

    private Prices prices;

    @BeforeEach
    void setUp() {
        prices = new Prices();
    }

    @Test
    void printPrices() {
        //when
        prices.printPrices();
    }
}