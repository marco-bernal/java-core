package com.mab.core.collections.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class BasicMapExampleTest {

    private BasicMapExample basicMapExample;

    @BeforeEach
    void setUp() {
        basicMapExample = new BasicMapExample();
    }

    @Test
    void printMapValuesWithLambda() {
        //given
        Map<String, Integer> scores = getScores();

        //when
        basicMapExample.printMapValuesWithLambda(scores);
    }

    @Test
    void printMapValuesWithStreams() {
        //given
        Map<String, Integer> scores = getScores();

        //when
        basicMapExample.printMapValuesWithStreams(scores);
    }

    @Test
    void shouldPrintMapValuesOrderedByInsertion() {
        //given
        Map<String, Integer> scores = getSortedScores();

        //when
        basicMapExample.printMapValuesWithStreams(scores);
    }

    @Test
    void shouldPrintMapValuesOrderedAlphabetically() {
        //given
        Map<String, Integer> scores = getScoresSortedAlphabetically();

        //when
        basicMapExample.printMapValuesWithStreams(scores);
    }

    //Returns immutable map, doesn't preserve the insertion order
    private Map<String, Integer> getScores() {
        return Map.ofEntries(
                Map.entry("asa", 7364),
                Map.entry("dsd", 9348),
                Map.entry("ndb", 5243),
                Map.entry("cbd", 1324),
                Map.entry("eud", 8785)
        );
    }

    //Preserves the order of insertion because uses a LinkedHasMap
    private Map<String, Integer> getSortedScores() {
            Map<String, Integer> sortedScores = new LinkedHashMap<>();
            sortedScores.put("asa", 7364);
            sortedScores.put("dsd", 9348);
            sortedScores.put("ndb", 5243);
            sortedScores.put("cbd", 1324);
            sortedScores.put("eud", 8785);
        return sortedScores;
    }

    // TreeMap sorts based on natural order
    private Map<String, Integer> getScoresSortedAlphabetically() {
            Map<String, Integer> sortedScores = new TreeMap<>();
            sortedScores.put("asa", 7364);
            sortedScores.put("dsd", 9348);
            sortedScores.put("ndb", 5243);
            sortedScores.put("cbd", 1324);
            sortedScores.put("eud", 8785);
        return sortedScores;
    }
}