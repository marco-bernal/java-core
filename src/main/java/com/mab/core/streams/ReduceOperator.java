package com.mab.core.streams;

import java.util.Arrays;

public class ReduceOperator {

    public int getArraySum(int[] inputArray) {
        return Arrays.stream(inputArray)
                .reduce(0, Integer::sum);
    }
}
