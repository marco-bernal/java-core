package com.mab.core.model;

import lombok.Builder;

@Builder
public record NbaPlayerDto(
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
