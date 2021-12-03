package com.mab.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

//TODO: Replace model with something else

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Algorithm {

    private UUID algorithmId;
    private Date createdOn;
    private String algorithmName;
    private String version;
}
