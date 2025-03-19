package com.mab.core.oop.equals_hash_code.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@EqualsAndHashCode
public class CustomerWithEqualsHashCode {
    private int age;
    private String name;
}
