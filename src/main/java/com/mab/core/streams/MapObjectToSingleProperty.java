package com.mab.core.streams;


import com.mab.core.model.Algorithm;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static java.util.Comparator.comparing;

//TODO: Switch Algorithm with User/Person/Employee or Car
public class MapObjectToSingleProperty {

    public List<UUID> getAlgorithmUuids(List<Algorithm> algorithms) {
        return algorithms
                .stream()
                .map(Algorithm::getAlgorithmId)
                .toList();
    }

    public UUID getLatestAlgorithm(List<Algorithm> algorithms) {
        Optional<UUID> algorithmUuid = algorithms
                .stream()
                .max(comparing(Algorithm::getCreatedOn))
                .map(Algorithm::getAlgorithmId);

        return algorithmUuid.orElseThrow(RuntimeException::new);
    }
}
