package com.mab.core.streams;

import com.mab.core.model.CarDto;
import java.util.*;

import static java.util.Comparator.comparingDouble;
import static java.util.stream.Collectors.*;

//TODO: Add tests
public class MapObjectToProperties {

    public Map<String, List<String>> getCarModelsByMake(List<CarDto> cars) {
        return cars.stream()
                .collect(
                        groupingBy(CarDto::make, mapping(CarDto::model, toList()))
                );
    }

    public Map<String, Double> getMoreExpensiveCarByMake(List<CarDto> cars) {
        return cars.stream()
                .collect(
                        groupingBy(CarDto::make, maxBy(comparingDouble(CarDto::price))))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().isPresent())
                .collect(toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().get().price()
                ));
    }
}
