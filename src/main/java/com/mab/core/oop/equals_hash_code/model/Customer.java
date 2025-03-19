package com.mab.core.oop.equals_hash_code.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
/**
 * Not a Java Record.
 * Due to the importance of having the object without the equals and hashCode methods to study their use.
 */
public class Customer {
    private int age;
    private String name;
}
