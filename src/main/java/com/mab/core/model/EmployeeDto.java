package com.mab.core.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record EmployeeDto(
        String employeeId,
        String fullName,
        String jobTitle,
        String department,
        String businessUnit,
        String gender,
        String ethnicity,
        Integer age,
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
        LocalDateTime hireDate,
        Double annualSalary,
        Integer bonusPercentage,
        String country,
        String city,
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
        LocalDateTime exitDate
) {}
