package com.mab.core.collections.conversion.list;

import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class List2Array {

    /**
     * Converts a String List to a String array.
     */
    public static String[] stringListToStringArray(List<String> strings) {
        return strings
                .toArray(String[]::new);
    }

    /**
     * Converts an Integer List to an Integer[] array.
     */
    public static Integer[] integerListToIntegerArray(List<Integer> integers) {
        return integers
                .toArray(Integer[]::new);
    }

    /**
     * Converts an Integer List to an int array.
     */
    public static int[] integerListToArray(List<Integer> integers) {
        return integers.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
