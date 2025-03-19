package com.mab.core.streams;

import com.mab.core.model.Car;
import java.util.*;

import static java.util.Comparator.comparingDouble;
import static java.util.stream.Collectors.*;

//TODO: Add tests
public class MapObjectToProperties {

    public Map<String, List<String>> getCarModelsByMake(List<Car> cars) {
        return cars.stream()
                .collect(
                        groupingBy(Car::make, mapping(Car::model, toList()))
                );
    }

    public Map<String, Double> getMoreExpensiveCarByMake(List<Car> cars) {
        return cars.stream()
                .collect(
                        groupingBy(Car::make, maxBy(comparingDouble(Car::price))))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().isPresent())
                .collect(toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().get().price()
                ));
    }
}
