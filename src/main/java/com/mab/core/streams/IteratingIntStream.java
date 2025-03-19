package com.mab.core.streams;

import com.mab.core.model.EmployeeDto;

import java.util.List;

public class IteratingIntStream {

    public List<EmployeeDto> filterFemaleWorkersAge30OrGreater(List<EmployeeDto> employees) {
        return employees.stream()
                .filter(e -> e.gender().equals("Female"))
                .filter(e-> e.age() < 30)
                .toList();
    }
}
