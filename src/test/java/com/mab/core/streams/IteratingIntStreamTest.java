package com.mab.core.streams;

import com.mab.core.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class IteratingIntStreamTest {

    private IteratingIntStream iteratingIntStream;

    @BeforeEach
    void setUp() {
        iteratingIntStream = new IteratingIntStream();
    }

    @Test
    void iterateWithRange() {
        iteratingIntStream.iterateWithRange();
    }

    @Test
    void iterateWithIterate() {
        IntStream.iterate(0, i -> i +1)
                .filter(n -> n % 2 == 0)
                .limit(9)
                .forEach(System.out::print);
    }

    @Test
    void iterateOverWomenYoungerThan30() {
        //given

        //when
        List<Person> women = iteratingIntStream.loadFemales();

        //then
        assertThat(women).hasSize(144);

        IntStream.range(0, women.size())
                .forEach( i -> {
                    System.out.println(women.get(i));
                });
    }
}