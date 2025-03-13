package com.mab.core.model;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CustomerWithEquals that = (CustomerWithEquals) o;
        return age == that.age && Objects.equals(name, that.name);
    }
}
