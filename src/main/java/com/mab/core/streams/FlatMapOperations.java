package com.mab.core.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapOperations {

    public List<String> mergeNamesMutable(List<List<String>> names) {
        return names.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList()); //Mutable collection.
    }

    public List<String> mergeNamesImmutable(List<List<String>> names) {
        return names.stream()
                .flatMap(List::stream)
                .toList(); //Immutable collection.
    }
}
