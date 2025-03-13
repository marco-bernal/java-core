package com.mab.core.streams;

import com.mab.core.model.Car;
import com.mab.core.util.LoadDataSetsUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

@Slf4j
@Component
@RequiredArgsConstructor
public class GroupingOperations {

    private final LoadDataSetsUtils loadDataSetsUtils;

    public Map<String, List<Car>> groupCarsByMake() {

        return loadDataSetsUtils.loadCars()
                .stream()
                .collect(groupingBy(Car::make));
    }


    public Map<String, Long> countingByMake() {

        return loadDataSetsUtils.loadCars()
                .stream()
                .collect(groupingBy(Car::make, Collectors.counting()));
    }

    //TODO: Add more complex examples: get 5 most expensive cars by make.
    // And, examples like that one.

}
