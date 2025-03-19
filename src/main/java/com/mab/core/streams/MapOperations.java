package com.mab.core.streams;

import com.mab.core.model.Car;
import com.mab.core.model.CarRecommendationDto;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapOperations {

    //TODO: Add more operations
    public Set<CarRecommendationDto> getCarRecommendations(List<Car> cars) {
        return cars.stream()
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
        return year > 2010 && price < 12000;
    }
}
