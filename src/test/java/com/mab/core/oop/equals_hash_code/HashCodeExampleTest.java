package com.mab.core.oop.equals_hash_code;

import com.mab.core.model.CustomerWithEquals;
import com.mab.core.model.CustomerWithEqualsHashCode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class HashCodeExampleTest {

    private HashCodeExample hashCodeExample;

    @BeforeEach
    void setUp() {
        hashCodeExample = new HashCodeExample();
    }

    @Test
    void getDistinctValuesNoHashCode() {
        //given
        CustomerWithEquals c1 = CustomerWithEquals.builder().name("Karen").age(66).build();
        CustomerWithEquals c2 = CustomerWithEquals.builder().name("Karen").age(66).build();

        //when
        Set<CustomerWithEquals> result = hashCodeExample.getDistinctValuesNoHashCode(c1, c2);

        //then
        log.info("c1 hashCode: {}. c1 hashCode: {}." , c1.hashCode(), c2.hashCode());
        assertThat(result).hasSize(2);
    }

    @Test
    void getDistinctValuesWithHashCode() {
        //given
        CustomerWithEqualsHashCode c1 = CustomerWithEqualsHashCode.builder().name("Karen").age(66).build();
        CustomerWithEqualsHashCode c2 = CustomerWithEqualsHashCode.builder().name("Karen").age(66).build();

        //when
        Set<CustomerWithEqualsHashCode> result = hashCodeExample.getDistinctValuesWithHashCode(c1, c2);

        //then
        log.info("c1 hashCode: {}. c1 hashCode: {}." , c1.hashCode(), c2.hashCode());
        assertThat(result).hasSize(1);
    }
}