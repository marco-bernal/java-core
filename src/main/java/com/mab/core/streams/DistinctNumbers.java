package com.mab.core.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctNumbers {

    public List<Integer> removeDuplicatesDistinct(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .toList();
    }

    public Set<Integer> removeDuplicatesSet(List<Integer> numbers) {
        return new HashSet<>(numbers);
    }
}
 