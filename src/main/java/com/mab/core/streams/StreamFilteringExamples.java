package com.mab.core.streams;

import com.mab.core.model.EmployeeDto;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

class StreamFilteringExamples {

    public Set<EmployeeDto> filterEmployeesByDepartment(Set<EmployeeDto> employees, String department) {
        return employees.stream()
                .filter(e -> e.department().equals(department))
                .collect(toSet());
    }

    public Set<EmployeeDto> filterEmployeesNotManufacturing(Set<EmployeeDto> employees) {
        return employees.stream()
                .filter(e -> !"Manufacturing".equals(e.businessUnit()))
                .collect(toSet());
    }

    public List<EmployeeDto> filterEmployeesByAnnualSalary(List<EmployeeDto> employees) {
        return employees.stream()
                .filter(e -> e.annualSalary() > 50000)
                .toList();
    }

    //TODO: Add test and more complex examples.
}
