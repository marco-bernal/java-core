package com.mab.core;

import lombok.experimental.UtilityClass;

import java.util.Random;

@UtilityClass
public class Utils {

    private final Random random = new Random();

    public static int generateRandomNumber(int min, int max) {
        return min + random.nextInt((max - min)) + 1;
    }
}
