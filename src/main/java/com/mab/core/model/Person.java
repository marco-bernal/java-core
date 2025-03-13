package com.mab.core.model;

import lombok.Builder;

@Builder
public record Person(
        Integer id,
        String firstName,
        String lastName,
        String email,
        String gender,
        Integer age
) {}
