package com.mab.core.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class JoiningStringsTest {

    private JoiningStrings joiningStrings;

    private final List<String> immutableNames =
            List.of("Mariam", "Alex", "Ismail", "John", "Alesha", "Andre", "Susy", "Ali"); //List.of -> Immutable.

    @BeforeEach
    void setUp() {
        joiningStrings = new JoiningStrings();
    }

    @Test
    void joinByPipe() {
        //when
        String result = joiningStrings.joinByPipe(immutableNames);

        //then
        assertThat(result).isEqualTo("Mariam | Alex | Ismail | John | Alesha | Andre | Susy | Ali");
    }
}