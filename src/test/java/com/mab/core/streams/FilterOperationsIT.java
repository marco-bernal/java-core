package com.mab.core.streams;

import com.mab.core.model.Car;
import com.mab.core.test_utils.IntegrationTestBaseConfig;
import com.mab.core.util.LoadDataSetsUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@IntegrationTestBaseConfig
class FilterOperationsIT {

    @Autowired
    private LoadDataSetsUtils loadDataSetsUtils;

    private FilterOperations filterOperations;

    @BeforeEach
    void setUp() {
        filterOperations = new FilterOperations(loadDataSetsUtils);
    }

    @Test
    void getToyotaCarsFrom2007() {
        //when
        Set<Car> toyotaCars2007 = filterOperations.getToyotaCarsFrom2007();

        //then
        assertThat(toyotaCars2007).hasSize(23);
    }
}