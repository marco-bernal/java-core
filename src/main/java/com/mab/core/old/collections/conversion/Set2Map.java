package com.mab.core.old.collections.conversion;

import com.mab.core.model.Customer;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Set2Map {

    public Map<Integer, String> getMapValuesFromSet(Set<Customer> values) {
        return values.stream()
                .collect(Collectors.toMap(
                        Customer::getAge,
                        Customer::getName
                ));
    }
}
