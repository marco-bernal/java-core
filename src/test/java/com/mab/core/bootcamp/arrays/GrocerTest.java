package com.mab.core.bootcamp.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GrocerTest {

    private Grocer grocer;

    @BeforeEach
    void setUp() {
        grocer = new Grocer();
    }

    @Test
    void shouldGetAisleWhenProductIsFound() {
        //given
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        String product = "coffee";

        //when
        int aisle = grocer.getAisle(aisles, product);

        //then
        assertThat(aisle).isEqualTo(4);
    }

    @Test
    void shouldNotFoundAisleWhenProductDoesNotExist() {
        //given
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        String product = "car";

        //when
        int aisle = grocer.getAisle(aisles, product);

        //then
        assertThat(aisle).isEqualTo(-1);
    }
}