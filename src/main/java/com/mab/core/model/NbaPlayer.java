package com.mab.core.model;

public record NbaPlayer(
        String name,
        String team,
        int number,
        String position,
        int age,
        float height,
        int weight,
        String college,
        double salary
) {
}
