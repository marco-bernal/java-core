package com.mab.core.dates;

import com.mab.core.model.JacksonTestDto;
import java.time.LocalDateTime;
import java.util.List;

import static java.util.Comparator.comparing;

public class Jackson2Instant {

    public List<JacksonTestDto> getLatest3Tests(List<JacksonTestDto> testDates) {
        return testDates.stream()
                .sorted(comparing(JacksonTestDto::testDate).reversed())
                .limit(3)
                .toList();
    }

    public JacksonTestDto getLatestTest(List<JacksonTestDto> testDates) {
        return testDates.stream()
                .max(comparing(JacksonTestDto::testDate))
                .orElse(new JacksonTestDto(0, LocalDateTime.now()));
    }
}