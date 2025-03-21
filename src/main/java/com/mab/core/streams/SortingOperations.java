package com.mab.core.streams;

import com.mab.core.model.NbaPlayerDto;
import java.util.List;

import static java.util.Comparator.comparing;

public class SortingOperations {

    public List<NbaPlayerDto> sortByHigherSalaryAndAgeGreaterThan35(List<NbaPlayerDto> players) {
        return players.stream()
                .filter(p -> p.age() >= 35)
                .sorted(comparing(NbaPlayerDto::salary).reversed())
                .toList();
    }

    //TODO: Add more complex examples
    // Add examples of when to use the Comparable Interface.
}
