package com.mab.core.streams;


import com.mab.core.model.CarRecommendationDto;

import java.util.Set;
import java.util.stream.Collectors;

import static com.mab.core.util.StreamUtils.loadCars;


public class MapOperations {

    public Set<CarRecommendationDto> getCarRecommendations() {
        return loadCars().stream()
                .filter(c -> isCarRecommended(c.year(), c.price()))
                .map(c -> new CarRecommendationDto(
                            c.make(),
                            c.model(),
                            c.year(),
                            c.price(),
                            isCarRecommended(c.year(), c.price())))
                .collect(Collectors.toSet());
    }

    public Double getMeanPrice(Set<CarRecommendationDto> recommendations) {
        return recommendations.stream()
                .mapToDouble(CarRecommendationDto::price)
                .average()
                .orElse(0);
    }

    private boolean isCarRecommended(Integer year, Double price) {
        if (year > 2010)
            if (price < 12000)
                return true;

        return false;
    }
}
