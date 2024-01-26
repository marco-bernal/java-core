package com.mab.core.bootcamp.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HighestScoreTest {

    private HighestScore highestScore;

    @BeforeEach
    void setUp() {
        highestScore = new HighestScore();
    }

    @Test
    void getHigherScore() {
        //when
        int score = highestScore.getHighestScore();

        //then
        assertThat(score).isPositive();
    }
}