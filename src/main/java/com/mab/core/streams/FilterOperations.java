package com.mab.core.streams;

import com.mab.core.model.CarDto;
import com.mab.core.model.EmployeeDto;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class FilterOperations {

    public Set<EmployeeDto> filterEmployeesByDepartment(List<EmployeeDto> employees, String department) {
        return employees.stream()
                .filter(e -> e.department().equals(department))
                .collect(toSet());
    }

    public Set<EmployeeDto> filterEmployeesNotManufacturing(List<EmployeeDto> employees) {
        return employees.stream()
                .filter(e -> !"Manufacturing".equals(e.businessUnit()))
                .collect(toSet());
    }

    public List<EmployeeDto> filterEmployeesByAnnualSalary(List<EmployeeDto> employees) {
        return employees.stream()
                .filter(e -> e.annualSalary() > 95000)
                .toList();
    }

    public List<EmployeeDto> filterFemaleWorkersYoungerThan30(List<EmployeeDto> employees) {
        return employees.stream()
                .filter(e -> e.gender().equals("Female"))
                .filter(e-> e.age() < 30)
                .toList();
    }

    public Set<CarDto> getToyotaCarsFrom2007(List<CarDto> cars) {
        return cars.stream()
                .filter(c -> c.make().equals("Toyota"))
                .filter(c -> c.year() > 2006)
                .collect(Collectors.toSet());
    }

    //TODO: Add more complex examples
}
