package com.mab.core.oop.equals_hash_code.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Builder
public class CustomerWithEquals {

    private int age;
    private String name;

    /**
     * Not overriding the hasCode method on purpose, just to study the equals method separately.
     * @param o Object to compare.
     * @return true or false, based on the equals' method.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CustomerWithEquals that = (CustomerWithEquals) o;
        return age == that.age && Objects.equals(name, that.name);
    }
}
