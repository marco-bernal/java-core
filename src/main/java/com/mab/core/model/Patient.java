package com.mab.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


//TODO: Replace model with something else

@Data
@Builder
@AllArgsConstructor
public class Patient {

    private Integer patientId;
    private String tumorType;
    private String diagnosis;
}
