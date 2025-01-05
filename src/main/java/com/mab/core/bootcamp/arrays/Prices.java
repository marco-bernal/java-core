package com.mab.core.bootcamp.arrays;

public class Prices {

    private final double[][] prices = {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99}
    };

    /**
     * Iterates over a 2D array and prints its content.
     * Workbook 6.13.2 from Java Bootcamp.
     */
    public void printPrices() {
        for (int i=0; i < prices.length; i++) { // 0 to 2

            switch (i) {
                case 0: System.out.print("Baking: "); break;
                case 1: System.out.print("Beverage: "); break;
                case 2: System.out.print("Cereals: "); break;
            }

            for (int j=0; j < prices[i].length; j++) { // 0 to 4
                System.out.print(prices[i][j] + " ");
            }

            System.out.print("\n");
        }
    }
}
