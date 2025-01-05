package com.mab.core.model;

public record Person(
        Integer id,
        String firstName,
        String lastName,
        String email,
        String gender,
        Integer age
) {}
