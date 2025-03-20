package com.mab.core.model;

import lombok.Builder;

@Builder
public record CarRecommendationDto(
        String make,
        String model,
        Integer year,
        Double price,
        boolean isRecommended
) {
}
