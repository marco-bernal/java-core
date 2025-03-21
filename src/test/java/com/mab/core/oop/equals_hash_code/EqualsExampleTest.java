package com.mab.core.oop.equals_hash_code;

import com.mab.core.oop.equals_hash_code.model.Customer;
import com.mab.core.oop.equals_hash_code.model.CustomerWithEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EqualsExampleTest {

    private EqualsExample equalsExample;

    @BeforeEach
    void setUp() {
        equalsExample = new EqualsExample();
    }

    @Test
    void shouldReturnFalseWhenEqualsIsMissing() {
        //given
        Customer c1 = Customer.builder().name("Karen").age(66).build();
        Customer c2 = Customer.builder().name("Karen").age(66).build();

        //when
        boolean result = equalsExample.validateEquals(c1, c2);

        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnTrueWhenOverridesEquals() {
        //given
        CustomerWithEquals c1 = CustomerWithEquals.builder().name("Karen").age(66).build();
        CustomerWithEquals c2 = CustomerWithEquals.builder().name("Karen").age(66).build();

        //when
        boolean result = equalsExample.validateEqualsWithEquals(c1, c2);

        //then
        assertThat(result).isTrue();
    }
}