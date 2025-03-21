package com.mab.core.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import java.time.LocalDateTime;

@Builder
public record JacksonTestDto(
        int testId,
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
        LocalDateTime testDate
) {
}
