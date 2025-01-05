package com.mab.core.bootcamp.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CelciusFahrenheitConverterTest {

    private CelciusFahrenheitConverter celciusFahrenheitConverter;

    @BeforeEach
    void setUp() {
        celciusFahrenheitConverter = new CelciusFahrenheitConverter();
    }

    @Test
    void shouldConvertArrayOfCeliciusToFahrenheit() {
        //given
        double[] celcius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};

        //when
        double[] fahrenheit = celciusFahrenheitConverter.celciusToFahrenheit(celcius);

        //then
        assertThat(fahrenheit)
                .isNotEmpty()
                .containsExactly(
                54.5,
                58.099999999999994,
                62.599999999999994,
                69.80000000000001,
                73.4,
                65.30000000000001,
                68.0
        );
    }
}
