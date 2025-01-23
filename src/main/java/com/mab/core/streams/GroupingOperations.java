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

    public void groupCarsByMake() {
        //TODO: All filters to return only 2 makes
        Map<String, List<Car>> carsByMake = loadDataSetsUtils.loadCars()
                .stream()
                .collect(groupingBy(Car::make));

        //TODO: Delete this
        carsByMake.forEach(
                (make, cars) -> {
                    log.info("Make: {}", make);

                    cars.forEach(c -> log.info("Car: {}", c));
                }
        );
    }


    public void countingByMake() {
        //TODO: Return counts
        Map<String, Long> countsByMake = loadDataSetsUtils.loadCars()
                .stream()
                .collect(groupingBy(Car::make, Collectors.counting()));

        //TODO: Delete this
        countsByMake.forEach(
                (make, count) ->
                        log.info("Make: {}. Count: {}.", make, count)
        );
    }
}
