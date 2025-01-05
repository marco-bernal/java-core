package com.mab.core.bootcamp.arrays;

public class Grocer {

    /**
     * Workbook 6.3 from Java Bootcamp
     *
     * @param aisles array containing aisles(indexes) and products(values).
     * @param product customer given product.
     * @return aisle number or -1 when not found.
     */
    public int getAisle(String[] aisles, String product) {
        //Iterates over the aisles array and if it finds the product, returns the aisle
        for (int i=0; i < aisles.length; i++) {
            if (product.equals(aisles[i])) {
                return i;
            }
        }

        //not found
        return -1;
    }
}
