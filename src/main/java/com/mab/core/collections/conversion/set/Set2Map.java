package com.mab.core.collections.conversion.set;

import com.mab.core.model.EmployeeDto;
import lombok.experimental.UtilityClass;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@UtilityClass
public class Set2Map {

    /**
     * Converts a employeeSet into a Map, using java 8 streams.
     *
     * @param employees employees set.
     * @return Map<Integer, String> containing employees age less than 30 and department.
     */
    public static Map<String, String> getMapValuesFromSet(Set<EmployeeDto> employees) {
        return employees.stream()
                .filter(e -> e.age() < 30)
                .collect(Collectors.toMap(
                        EmployeeDto::employeeId,
                        EmployeeDto::department
                ));
    }
}
