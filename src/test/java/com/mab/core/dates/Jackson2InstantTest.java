package com.mab.core.dates;

import com.mab.core.model.JacksonTestDto;
import com.mab.core.test_utils.IntegrationTestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Jackson2InstantTest extends IntegrationTestBase {

    private Jackson2Instant jackson2Instant;

    @BeforeEach
    void setUp() {
        jackson2Instant = new Jackson2Instant();
    }

    @Test
    void getLatest3Tests() {
        //given
        List<JacksonTestDto> testDates = loadTestDates();

        //when
        List<JacksonTestDto> results = jackson2Instant.getLatest3Tests(testDates);

        //then
        assertThat(results).isNotEmpty();
    }

    @Test
    void getLatestTest() {
        //given
        List<JacksonTestDto> testDates = loadTestDates();

        //when
        JacksonTestDto result = jackson2Instant.getLatestTest(testDates);

        //then
        assertThat(result).isNotNull();
    }
}