package com.mab.core.model;

import lombok.Builder;

@Builder
public record CarDto(
        Integer id,
        String make,
        String model,
        String color,
        Integer year,
        Double price
) {}
