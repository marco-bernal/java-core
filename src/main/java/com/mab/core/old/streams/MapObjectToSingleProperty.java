package com.mab.core.old.streams;

import com.mab.core.model.Algorithm;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

//TODO: Add unit tests. Replace Algorithm with Customer or something else

public class MapObjectToSingleProperty {

    public List<UUID> getAlgorithmUuids(List<Algorithm> algorithms) {
        return algorithms
                .stream()
                .map(Algorithm::getAlgorithmId)
                .collect(toList());
    }

    public UUID getLatestAlgorithm(List<Algorithm> algorithms) {
        Optional<UUID> algorithmUuid = algorithms
                .stream()
                .max(comparing(Algorithm::getCreatedOn))
                .map(Algorithm::getAlgorithmId);

        return algorithmUuid.orElseThrow(RuntimeException::new);
    }
}
