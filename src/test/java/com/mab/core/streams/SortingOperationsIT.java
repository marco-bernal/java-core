package com.mab.core.streams;

import com.mab.core.model.NbaPlayerDto;
import com.mab.core.test_utils.IntegrationTestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SortingOperationsIT extends IntegrationTestBase {

    private SortingOperations sortingOperations;

    @BeforeEach
    void setUp() {
        sortingOperations = new SortingOperations();
    }

    @Test
    void sortByHigherSalaryAndAgeGreaterThan35() {
        //given
        List<NbaPlayerDto> nbaPlayers = loadNbaPlayers();

        //when
        List<NbaPlayerDto> filteredNbaPlayers = sortingOperations.sortByHigherSalaryAndAgeGreaterThan35(nbaPlayers);

        //then
        assertThat(filteredNbaPlayers).hasSize(23);
    }
}