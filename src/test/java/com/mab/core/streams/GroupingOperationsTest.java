package com.mab.core.streams;

import com.mab.core.test_utils.IntegrationTestBaseConfig;
import com.mab.core.util.LoadDataSetsUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@IntegrationTestBaseConfig
class GroupingOperationsTest {

    @Autowired
    private LoadDataSetsUtils loadDataSetsUtils;

    private GroupingOperations groupingOperations;

    @BeforeEach
    void setUp() {
        groupingOperations = new GroupingOperations(loadDataSetsUtils);
    }

    //TODO: Add assertions
    @Test
    void groupCarsByMake() {
        groupingOperations.groupCarsByMake();

    }

    @Test
    void countingByMake() {
        groupingOperations.countingByMake();
    }
}