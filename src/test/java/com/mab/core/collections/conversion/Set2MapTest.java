package com.mab.core.collections.conversion;

import com.mab.core.collections.conversion.Set2Map;
import com.mab.core.model.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Set2MapTest {

    private Set2Map set2Map;

    @BeforeEach
    void setUp() {
        set2Map = new Set2Map();
    }

    @Test
    void shouldConvertSetToMap() {
     //given
     Set<Customer> customerSet = filloutCustomerSet();

     //when
     Map<Integer, String> customerMap = set2Map.getMapValuesFromSet(customerSet);

     //then
     assertThat(customerMap)
             .isNotEmpty()
             .containsKeys(34, 28, 40)
             .containsValues("Joseph", "Logan", "Mary");

    }

    private Set<Customer> filloutCustomerSet() {
        Customer c1 = Customer.builder().age(34).name("Joseph").build();
        Customer c2 = Customer.builder().age(28).name("Logan").build();
        Customer c3 = Customer.builder().age(40).name("Mary").build();

        return Stream.of(c1, c2, c3).collect(Collectors.toSet());
    }
}
