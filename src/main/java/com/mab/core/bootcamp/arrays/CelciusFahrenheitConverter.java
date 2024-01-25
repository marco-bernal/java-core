package com.mab.core.bootcamp.arrays;

import java.util.Arrays;

public class CelciusFahrenheitConverter {

    public double[] celciusToFahrenheit(double[] celcius) {
        double[] fahrenheit = Arrays.copyOf(celcius, celcius.length);

        for (int i=0; i < celcius.length; i++) {
            fahrenheit[i] = computeFahrenheit(celcius[i]);
        }

        return fahrenheit;
    }

    private double computeFahrenheit(double celcius) {
        return ((celcius / 5) * 9 ) + 32;
    }
}