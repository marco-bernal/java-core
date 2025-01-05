package com.mab.core.streams;

import com.mab.core.model.Car;

import java.util.Set;
import java.util.stream.Collectors;

import static com.mab.core.util.StreamUtils.loadCars;

public class FilterOperations {

    public Set<Car> getToyotaCarsFrom2007() {
        return loadCars().stream()
                .filter(c -> c.make().equals("Toyota"))
                .filter(c -> c.year() > 2006)
                .collect(Collectors.toSet());
    }
}
