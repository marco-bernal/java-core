package com.mab.core.streams;


import com.mab.core.model.Car;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.mab.core.util.StreamUtils.loadCars;
import static java.util.stream.Collectors.groupingBy;

public class GroupingOperations {

    public void groupCarsByMake() {
        Map<String, List<Car>> carsByMake = loadCars().stream()
                .collect(groupingBy(Car::make));

        carsByMake.forEach(
                (make, cars) -> {
                    System.out.println(make);

                    cars.forEach(System.out::println);
                }
        );

    }


    public void countingByMake() {
        Map<String, Long> countsByMake = loadCars().stream()
                .collect(groupingBy(Car::make, Collectors.counting()));

        countsByMake.forEach(
                (make, count) ->
                    System.out.println("Make: " + make + " Count:" + count)
        );
    }
}
