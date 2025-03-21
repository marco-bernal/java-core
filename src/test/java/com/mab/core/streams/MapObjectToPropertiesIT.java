package com.mab.core.streams;

import com.mab.core.model.CarDto;
import com.mab.core.test_utils.IntegrationTestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


class MapObjectToPropertiesIT extends IntegrationTestBase {

    private MapObjectToProperties mapObjectToProperties;

    @BeforeEach
    void setUp() {
        mapObjectToProperties = new MapObjectToProperties();
    }

    @Test
    void getCarModelsByMake() {
        //given
        List<CarDto> cars = loadCars();

        //when
        Map<String, List<String>> carModelsByMake = mapObjectToProperties.getCarModelsByMake(cars);

        //then
        assertThat(carModelsByMake.values()).isNotEmpty();
        //TODO: Add proper Map related assertions.
    }

    @Test
    void getMoreExpensiveCarByMake() {
        //given
        List<CarDto> cars = loadCars();

        //when
        Map<String, Double> moreExpensiveCarsByMake = mapObjectToProperties.getMoreExpensiveCarByMake(cars);

        //then
        assertThat(moreExpensiveCarsByMake.values()).isNotEmpty();
        //TODO: Add proper Map related assertions.
    }
}