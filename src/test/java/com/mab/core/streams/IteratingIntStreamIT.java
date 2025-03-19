package com.mab.core.streams;

import com.mab.core.model.EmployeeDto;
import com.mab.core.test_utils.IntegrationTestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class IteratingIntStreamIT extends IntegrationTestBase {

    private IteratingIntStream iteratingIntStream;

    @BeforeEach
    void setUp() {
        iteratingIntStream = new IteratingIntStream();
    }

    @Test
    void iterateOverWomenYoungerThan30() {
        //given
        List<EmployeeDto> employees = loadEmployees();

        //when
        List<EmployeeDto> femaleWorkers = iteratingIntStream.filterFemaleWorkersAge30OrGreater(employees);

        //then
        assertThat(femaleWorkers).hasSize(61);
    }
}