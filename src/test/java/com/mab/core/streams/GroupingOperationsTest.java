package com.mab.core.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GroupingOperationsTest {

    private GroupingOperations groupingOperations;

    @BeforeEach
    void setUp() {
        groupingOperations = new GroupingOperations();
    }

    @Test
    void groupCarsByMake() {
        groupingOperations.groupCarsByMake();

    }

    @Test
    void countingByMake() {
        groupingOperations.countingByMake();
    }
}