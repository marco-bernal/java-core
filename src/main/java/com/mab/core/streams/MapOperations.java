package com.mab.core.streams;

import com.mab.core.model.CarRecommendationDto;
import com.mab.core.util.LoadDataSetsUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class MapOperations {

    private final LoadDataSetsUtils loadDataSetsUtils;

    //TODO: Add more operations
    public Set<CarRecommendationDto> getCarRecommendations() {
        return loadDataSetsUtils.loadCars().stream()
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
