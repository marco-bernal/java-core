package com.mab.core.oop.equals_hash_code;

import com.mab.core.model.Customer;
import com.mab.core.model.CustomerWithEquals;

public class EqualsExample {

    /**
     *  This method will always return false, because doesn't override the @equals method.
     *  That means is not validating each field inside the object to determine equality correctly.
     *
     * @param c1 Customer object
     * @param c2 Customer object with same values as c1
     * @return false, because the object Customer doesn't override the @equals method.
     */
    public boolean validateEquals(Customer c1, Customer c2) {
        return c1.equals(c2);
    }

    /**
     * Opposite to the above method. This one overrides the @equals method.
     *
     * @param c1 Customer object
     * @param c2 Customer object with same values as c1
     * @return true.
     */
    public boolean validateEqualsWithEquals(
            CustomerWithEquals c1,
            CustomerWithEquals c2) {
        return c1.equals(c2);
    }
}
