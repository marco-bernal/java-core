package com.mab.core.bootcamp.arrays;

import static com.mab.core.Utils.generateRandomNumber;

public class RandomNumbersArrayGenerator {

    /**
     * Generates and prints a random 2d array.
     * Workbook 6.14 from Java Bootcamp.
     *
     */
    public void printRandomNumbersArray(int rows, int cols)  {
        int[][] randomArray = generateRandomArray(rows, cols);

        for (int i=0; i < rows; i++) {
            for (int j=0; j < cols; j++) {
                System.out.print(randomArray[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    private int[][] generateRandomArray(int rows, int cols) {
        int[][] randomArray = new int[rows][cols];

        for (int i=0; i < rows; i++) {
            for (int j=0; j < cols; j++) {
                randomArray[i][j] = generateRandomNumber(0, 100);
            }
        }
        return randomArray;
    }
}
