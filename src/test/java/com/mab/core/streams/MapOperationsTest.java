package com.mab.core.streams;

import com.mab.core.model.CarRecommendationDto;
import com.mab.core.test_utils.IntegrationTestBaseConfig;
import com.mab.core.util.LoadDataSetsUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@IntegrationTestBaseConfig
class MapOperationsTest {

    @Autowired
    private LoadDataSetsUtils loadDataSetsUtils;

    private MapOperations mapOperations;

    @BeforeEach
    void setUp() {
        mapOperations = new MapOperations(loadDataSetsUtils);
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