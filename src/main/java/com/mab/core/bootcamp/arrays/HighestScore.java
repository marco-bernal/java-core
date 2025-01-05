package com.mab.core.bootcamp.arrays;

import lombok.extern.slf4j.Slf4j;

import static com.mab.core.util.NumberUtils.generateRandomNumber;

@Slf4j
public class HighestScore {

    /**
     * Gets the highest score from a random array.
     * Workbook 6.5 from Java Bootcamp.
     *
     * @return highest score from the array.
     */
    public int getHighestScore() {
        int[] scores = fillOutRandomArray(10);
        int highestScore = 0;

        log.info("Here are the scores:");

        for (int score : scores) {
            log.info(score + "\t" );

            if (score > highestScore) {
                highestScore = score;
            }
        }

        log.info("Here's the highest score: {}", highestScore);

        return highestScore;
    }

    private int[] fillOutRandomArray(int limit) {
        //fills an array with 10 random numbers
        int[] randomArray = new int[limit];

        for (int i=0; i < limit; i++) {
            randomArray[i] = generateRandomNumber(0, 4999);
        }

        return randomArray;
    }
}
