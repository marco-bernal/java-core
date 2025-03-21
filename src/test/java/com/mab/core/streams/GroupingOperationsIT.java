package com.mab.core.streams;

import com.mab.core.model.CarDto;
import com.mab.core.test_utils.IntegrationTestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class GroupingOperationsIT extends IntegrationTestBase {

    private GroupingOperations groupingOperations;

    @BeforeEach
    void setUp() {
        groupingOperations = new GroupingOperations();
    }

    @Test
    void shouldGroupCarsByMake() {
        //given
        List<CarDto> cars = loadCars();

        //when
        Map<String, List<CarDto>> groupedCarsByMake = groupingOperations.groupCarsByMake(cars);

        //then
        assertThat(groupedCarsByMake.values()).isNotEmpty();
    }

    @Test
    void shouldCountCarsByMake() {
        //given
        List<CarDto> cars = loadCars();

        //when
        Map<String, Long> countsByMake = groupingOperations.countingByMake(cars);

        //then
        //List<Long> values = countsByMake.values().stream().toList();
        // TODO: Research how to do assertJ assertions for maps for both key and value(s).
        assertThat(countsByMake.values()).isNotEmpty();
    }
}