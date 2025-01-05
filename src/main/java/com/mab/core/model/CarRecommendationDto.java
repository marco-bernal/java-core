package com.mab.core.model;

public record CarRecommendationDto(
        String make,
        String model,
        Integer year,
        Double price,
        boolean isRecommended
) {
}
