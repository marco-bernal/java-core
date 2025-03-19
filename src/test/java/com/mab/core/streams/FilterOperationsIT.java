package com.mab.core.streams;

import com.mab.core.model.Car;
import com.mab.core.test_utils.IntegrationTestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class FilterOperationsIT extends IntegrationTestBase {

    private FilterOperations filterOperations;

    @BeforeEach
    void setUp() {
        filterOperations = new FilterOperations();
    }

    @Test
    void getToyotaCarsFrom2007() {
        // given
        List<Car> cars = loadCars();

        //when
        Set<Car> toyotaCars2007 = filterOperations.getToyotaCarsFrom2007(cars);

        //then
        assertThat(toyotaCars2007).hasSize(23);
    }
}