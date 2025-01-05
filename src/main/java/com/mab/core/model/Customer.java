package com.mab.core.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

//TODO: Change to record
@Getter
@Setter
@Builder
public class Customer {
    private int age;
    private String name;
}
