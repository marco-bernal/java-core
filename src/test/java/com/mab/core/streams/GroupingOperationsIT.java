package com.mab.core.streams;

import com.mab.core.model.Car;
import com.mab.core.test_utils.IntegrationTestBaseConfig;
import com.mab.core.util.LoadDataSetsUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@IntegrationTestBaseConfig
class GroupingOperationsIT {

    @Autowired
    private LoadDataSetsUtils loadDataSetsUtils;

    private GroupingOperations groupingOperations;

    @BeforeEach
    void setUp() {
        groupingOperations = new GroupingOperations(loadDataSetsUtils);
    }

    @Test
    void shouldGroupCarsByMake() {

        //when
        Map<String, List<Car>> groupedCarsByMake = groupingOperations.groupCarsByMake();

        //then
        assertThat(groupedCarsByMake.values()).isNotEmpty();
    }

    @Test
    void shouldCountCarsByMake() {

        //when
        Map<String, Long> countsByMake = groupingOperations.countingByMake();

        //then
        //List<Long> values = countsByMake.values().stream().toList();
        // TODO: Research how to do assertJ assertions for maps for both key and value(s).
        assertThat(countsByMake.values()).isNotEmpty();
    }
}