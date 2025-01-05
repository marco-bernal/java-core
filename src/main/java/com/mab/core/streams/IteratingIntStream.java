package com.mab.core.streams;

import com.mab.core.model.Person;

import java.util.List;
import java.util.stream.IntStream;

import static com.mab.core.util.StreamUtils.loadPeople;


public class IteratingIntStream {

    public void iterateWithRange() {
        System.out.println("Range exclusive");
        IntStream.range(0, 10).forEach(System.out::print);

        System.out.println("\nRange inclusive");
        IntStream.rangeClosed(1, 10).forEach(System.out::print);
    }

    public List<Person> loadFemales() {
        return loadPeople().stream()
                .filter(p-> p.gender().equals("Female"))
                .filter(p-> p.age() < 30)
                .toList();
    }
}
