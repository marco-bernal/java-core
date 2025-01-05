package com.mab.core.bootcamp.arrays;

import java.util.Arrays;

public class CelciusFahrenheitConverter {

    /**
     * Workbook 6.11 from Java Bootcamp.
     *
     * @param celcius degrees celcius.
     * @return fahrenheit degrees.
     */
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
