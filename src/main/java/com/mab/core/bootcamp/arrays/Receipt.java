package com.mab.core.bootcamp.arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Receipt {

    /**
     * Prints out the values of 2 arrays in one for loop.
     * Workbook 6.8 from Java Bootcamp.
     */
    public void printReceipt() {
        String[] apples = {"Gala", "Granny Smith", "Macintosh"};
        double[] prices = {1.99, 1.49, 1.29};

        for (int i = 0; i < apples.length; i++) {
            log.info(apples[i] + " : $" + prices[i]);
        }
    }
}
