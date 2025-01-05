package com.mab.core.streams;


import com.mab.core.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class FilterOperationsTest {

    private FilterOperations filterOperations;

    @BeforeEach
    void setUp() {
        filterOperations = new FilterOperations();
    }

    @Test
    void getToyotaCarsFrom2007() {
        //when
        Set<Car> toyotaCars2007 = filterOperations.getToyotaCarsFrom2007();

        //then
        assertThat(toyotaCars2007).hasSize(23);
    }
}