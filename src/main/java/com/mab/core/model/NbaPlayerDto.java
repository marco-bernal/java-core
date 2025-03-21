package com.mab.core.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Builder;

//FIXME: some cases shows salary=1.9689E7

@Builder
public record NbaPlayerDto(
        @JsonAlias({ "Name" }) //1 or more aliases
        String name,
        @JsonAlias({ "Team" })
        String team,
        @JsonAlias({ "Number" })
        int number,
        @JsonAlias({ "Position" })
        String position,
        @JsonAlias({ "Age" })
        int age,
        @JsonAlias({ "Height" })
        float height,
        @JsonAlias({ "Weight" })
        int weight,
        @JsonAlias({ "College" })
        String college,
        @JsonAlias({ "Salary" })
        double salary
) {
}
// @JsonAlias is used only for serialization (Json to object).
// When serialization and deserialization is required use @JsonProperty instead.