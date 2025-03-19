package com.mab.core.model;

import lombok.Builder;

@Builder
public record Car(
        Integer id,
        String make,
        String model,
        String color,
        Integer year,
        Double price
) {}
