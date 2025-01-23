package com.mab.core.collections.conversion.map;

import lombok.experimental.UtilityClass;

import java.util.Map;

@UtilityClass
public class Map2Array {

    /**
     * Converts a Map<String,Integer> to an Integer[] array.
     */
    public static Integer[] integerMapValuesToIntegerArray(Map<String,Integer> map) {
        return map.values()
                .toArray(Integer[]::new);
    }

    /**
     * Converts a Map<String,Integer> to an int[] array.
     */
    public static int[] integerMapValuesToIntArray(Map<String,Integer> map) {
        return map.values()
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static int[] getKeysFromMap(Map<Integer, Integer> resultMap) {
        return resultMap.entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
