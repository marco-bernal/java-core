package com.mab.core.bootcamp.arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class HighestScore {

    private final Random random = new Random();

    /**
     * Gets the highest score from a random array.
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
            randomArray[i] = generateRandomNumber();
        }

        return randomArray;
    }

    private int generateRandomNumber() {
        //generates a number between 0 and 49999
        int min = 0;
        int max = 49999;

        return min + random.nextInt((max - min)) + 1;
    }
}
