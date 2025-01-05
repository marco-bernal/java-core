package com.mab.core.streams;

import com.mab.core.model.CarRecommendationDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class MapOperationsTest {

    private MapOperations mapOperations;

    @BeforeEach
    void setUp() {
        mapOperations = new MapOperations();
    }

    @Test
    void getCarRecommendations() {
        //when
        Set<CarRecommendationDto> recommendations = mapOperations.getCarRecommendations();

        //then
        assertThat(recommendations).hasSize(13);
    }


    @Test
    void getMeanPrice() {
        //given
        Set<CarRecommendationDto> recommendations = mapOperations.getCarRecommendations();

        //when
        Double meanPrice = mapOperations.getMeanPrice(recommendations);

        //then
        assertThat(meanPrice).isPositive();
    }
}