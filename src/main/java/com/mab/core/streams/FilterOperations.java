package com.mab.core.streams;

import com.mab.core.model.Car;
import com.mab.core.util.LoadDataSetsUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class FilterOperations {

    private final LoadDataSetsUtils loadDataSetsUtils;

    public Set<Car> getToyotaCarsFrom2007() {

        List<Car> cars = loadDataSetsUtils.loadCars();

        return cars.stream()
                .filter(c -> c.make().equals("Toyota"))
                .filter(c -> c.year() > 2006)
                .collect(Collectors.toSet());
    }
}
