package com.mab.core.streams;

import com.mab.core.model.Car;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class GroupingOperations {

    public Map<String, List<Car>> groupCarsByMake(List<Car> cars) {
        return cars.stream()
                .collect(groupingBy(Car::make));
    }

    public Map<String, Long> countingByMake(List<Car> cars) {
        return cars.stream()
                .collect(groupingBy(Car::make, Collectors.counting()));
    }

    //TODO: Add more complex examples: get 5 most expensive cars by make.
    // And, examples like that one that require flatMap, filter, groupingBy, mapping and filtering operations.
}
