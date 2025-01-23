package com.mab.core.model;

import java.time.Instant;

public record Employee(
        String employeeId,
        String fullName,
        String jobTitle,
        String department,
        String businessUnit,
        String gender,
        String ethnicity,
        Integer age,
        Instant hireDate,
        Double annualSalary,
        Integer bonusPercentage,
        String country,
        String city,
        Instant exitDate
) {}
