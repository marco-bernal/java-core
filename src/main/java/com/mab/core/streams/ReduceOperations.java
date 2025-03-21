package com.mab.core.streams;

import java.util.Arrays;

public class ReduceOperations {

    public int getArraySum(int[] inputArray) {
        return Arrays.stream(inputArray)
                .reduce(0, Integer::sum);
    }

    //TODO: Add more complex examples
}
