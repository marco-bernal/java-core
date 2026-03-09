package com.mab.core.streams;

import com.mab.core.model.CarDto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class GroupingOperations {

    public Map<String, List<CarDto>> groupCarsByMake(List<CarDto> cars) {
        return cars.stream()
                .collect(groupingBy(CarDto::make));
    }

    public Map<String, Long> countingByMake(List<CarDto> cars) {
        return cars.stream()
                .collect(groupingBy(CarDto::make, Collectors.counting()));
    }

    //TODO: Add more complex examples: get 5 most expensive cars by make.
    // And, examples like that one that require flatMap, filter, groupingBy, mapping and filtering operations.

    /**
     * Adds a new car into an existing map of cars.
     *
     * @param carsByMake existing cars all makes.
     * @param newCar car to be added.
     * @param make key where the new car will be added, also serves as filter to return just that make.
     * @return updated map including the new car.
     */
    public Map<String, List<CarDto>> addNewCar(Map<String, List<CarDto>> carsByMake, CarDto newCar, String make) {
        // Filters out cars by make.
        Map<String, List<CarDto>> carsFilteredByMake =
                carsByMake.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(make))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue));

        //Adds a new car into the filtered map.
        carsFilteredByMake.get(make).add(newCar);
       return carsFilteredByMake;
    }
}