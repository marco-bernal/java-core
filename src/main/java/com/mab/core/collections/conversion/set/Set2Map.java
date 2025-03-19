package com.mab.core.collections.conversion.set;

import com.mab.core.model.EmployeeDto;
import lombok.experimental.UtilityClass;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@UtilityClass
public class Set2Map {

    /**
     * Converts a customerSet into a Map, using java 8 streams.
     *
     * @param employees employees set.
     * @return Map<Integer, String> containing employees age and department.
     */
    public static Map<Integer, String> getMapValuesFromSet(Set<EmployeeDto> employees) {
        return employees.stream()
                .collect(Collectors.toMap(
                        EmployeeDto::age,
                        EmployeeDto::department
                ));
    }
}
