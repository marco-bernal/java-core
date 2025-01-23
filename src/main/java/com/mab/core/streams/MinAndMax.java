package com.mab.core.streams;

import java.util.Comparator;
import java.util.List;

public class MinAndMax {

    public Integer getMax(List<Integer> values) {
        return values.stream()
                .max(Comparator.naturalOrder())
                .orElse(0);
    }

    public Integer getMin(List<Integer> values) {
        return values.stream()
                .min(Comparator.naturalOrder())
                .orElse(0);
    }

    //TODO: Add more ways to achieve the same result
}
