package com.mab.core.solid.dependency_inversion.good;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ElectricPowerSwitchTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void shouldTurnOnWhenObjectIsABulb() {
        //given
        Switchable switchableBulb = new LightBulb();
        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);

        //when
        bulbPowerSwitch.press();

        //then
        //spy for void methods

    }

    @Test
    void shouldTurnOnWhenObjectIsAFan() {
        //given
        Switchable switchableFan = new Fan();
        Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);

        //when
        fanPowerSwitch.press();

        //then
        //spy for void methods
    }
}