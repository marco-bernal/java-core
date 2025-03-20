package com.mab.core.streams;

import com.mab.core.model.CarDto;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//TODO: Add more complex operations
public class FilterOperations {

    public Set<CarDto> getToyotaCarsFrom2007(List<CarDto> cars) {
        return cars.stream()
                .filter(c -> c.make().equals("Toyota"))
                .filter(c -> c.year() > 2006)
                .collect(Collectors.toSet());
    }
}
