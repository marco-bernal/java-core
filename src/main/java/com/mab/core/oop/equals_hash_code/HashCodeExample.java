package com.mab.core.oop.equals_hash_code;

import com.mab.core.oop.equals_hash_code.model.CustomerWithEquals;
import com.mab.core.oop.equals_hash_code.model.CustomerWithEqualsHashCode;

import java.util.HashSet;
import java.util.Set;

public class HashCodeExample {

    /**
     * This method will return both objects in the set because the Set collections validates
     * equality of the objects using the HashCode method, not the equals one.
     * @param c1 Customer 1
     * @param c2 Customer with same values as c1
     * @return Set with both customers even though seem to have the same values.
     */
    public Set<CustomerWithEquals> getDistinctValuesNoHashCode(
            CustomerWithEquals c1,
            CustomerWithEquals c2) {
        return setValuesManually(c1,c2);
    }

    /**
     * This method will exclude duplicates based on the hashCode method
     *
     * @param c1 Customer 1
     * @param c2 Customer with same values as c1
     * @return Will return only one customer.
     */
    public Set<CustomerWithEqualsHashCode> getDistinctValuesWithHashCode(
            CustomerWithEqualsHashCode c1,
            CustomerWithEqualsHashCode c2) {
        return setValuesManually(c1,c2);
    }

    private <S> Set<S> setValuesManually(S value1, S value2) {
        Set<S> values = new HashSet<>();
        values.add(value1);
        values.add(value2);
        return values;
    }
}
