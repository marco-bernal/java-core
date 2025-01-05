package com.mab.core.collections.conversion;

import com.mab.core.model.Customer;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Set2Map {

    /**
     * Converts a customerSet into a Map, using java 8 streams.
     *
     * @param values customer set.
     * @return Map<Integer, String> containing customer's age and name.
     */
    public Map<Integer, String> getMapValuesFromSet(Set<Customer> values) {
        return values.stream()
                .collect(Collectors.toMap(
                        Customer::getAge,
                        Customer::getName
                ));
    }
}
