package com.mab.core.streams;

import com.mab.core.model.CarDto;
import com.mab.core.model.EmployeeDto;
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
    void getEmployeesByEngineeringDepartment() {
        //given
        List<EmployeeDto> employees = loadEmployees();

        //when
        Set<EmployeeDto> engineeringEmployees =
                filterOperations.filterEmployeesByDepartment(employees, "Engineering");

        //then
        assertThat(engineeringEmployees).hasSize(116);
    }

    @Test
    void getEmployeesNotInManufacturing() {
        //given
        List<EmployeeDto> employees = loadEmployees();

        //when
        Set<EmployeeDto> notManufacturingEmployees =
                filterOperations.filterEmployeesNotManufacturing(employees);

        //then
        assertThat(notManufacturingEmployees).hasSize(638);
    }

    @Test
    void getEmployeesSalaryGreaterThan95k() {
        //given
        List<EmployeeDto> employees = loadEmployees();

        //when
        List<EmployeeDto> employeesSalaryGreaterThan95k =
                filterOperations.filterEmployeesByAnnualSalary(employees);

        //then
        assertThat(employeesSalaryGreaterThan95k).hasSize(445);
    }


    @Test
    void getFemaleWorkersYoungerThan30() {
        //given
        List<EmployeeDto> employees = loadEmployees();

        //when
        List<EmployeeDto> femaleWorkers = filterOperations.filterFemaleWorkersYoungerThan30(employees);

        //then
        assertThat(femaleWorkers).hasSize(61);
    }

    @Test
    void getToyotaCarsFrom2007() {
        // given
        List<CarDto> cars = loadCars();

        //when
        Set<CarDto> toyotaCars2007 = filterOperations.getToyotaCarsFrom2007(cars);

        //then
        assertThat(toyotaCars2007).hasSize(23);
    }
}