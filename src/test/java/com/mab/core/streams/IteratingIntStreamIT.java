package com.mab.core.streams;

import com.mab.core.model.Person;
import com.mab.core.test_utils.IntegrationTestBaseConfig;
import com.mab.core.util.LoadDataSetsUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

@IntegrationTestBaseConfig
class IteratingIntStreamIT {

    @Autowired
    private LoadDataSetsUtils loadDataSetsUtils;

    private IteratingIntStream iteratingIntStream;

    @BeforeEach
    void setUp() {
        iteratingIntStream = new IteratingIntStream(loadDataSetsUtils);
    }

    @Test
    void iterateOverWomenYoungerThan30() {
        //given

        //when
        List<Person> women = iteratingIntStream.loadFemales();

        //then
        assertThat(women).hasSize(144);

        IntStream.range(0, women.size())
                .forEach( i -> {
                    System.out.println(women.get(i));
                });
    }
}