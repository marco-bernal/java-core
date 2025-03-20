package com.mab.core.streams;

import com.mab.core.model.CarDto;
import com.mab.core.model.CarRecommendationDto;
import com.mab.core.test_utils.IntegrationTestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class MapOperationsIT extends IntegrationTestBase {

    private MapOperations mapOperations;

    @BeforeEach
    void setUp() {
        mapOperations = new MapOperations();
    }

    @Test
    void getCarRecommendations() {
        //given
        List<CarDto> cars = loadCars();

        //when
        Set<CarRecommendationDto> recommendations = mapOperations.getCarRecommendations(cars);

        //then
        assertThat(recommendations).hasSize(13);
    }


    @Test
    void getMeanPrice() {
        //given
        List<CarDto> cars = loadCars();
        Set<CarRecommendationDto> recommendations = mapOperations.getCarRecommendations(cars);

        //when
        Double meanPrice = mapOperations.getMeanPrice(recommendations);

        //then
        assertThat(meanPrice).isPositive();
    }
}