package com.mab.core.solid.interface_segregation.good;

import org.junit.jupiter.api.Test;

class ToyBuilderTest {

    @Test
    void buildToyHouse() {
        //given

        //when
        ToyHouse toyHouse = ToyBuilder.buildToyHouse();

        //then
        System.out.println(toyHouse);
    }

    @Test
    void buildToyCar() {
        //given

        //when
        ToyCar toyCar = ToyBuilder.buildToyCar();

        //then
        System.out.println(toyCar);
    }

    @Test
    void buildToyPlane() {
        //given

        //when
        ToyPlane toyPlane = ToyBuilder.buildToyPlane();

        //then
        System.out.println(toyPlane);
    }
}