package com.mab.core.solid.dependency_inversion.bad;

/**
 * Tightly coupled code ElectricPowerSwitch it's coupled with LightBulb
 * If we'd like to add another usage of electricPowerSwitch, let's say
 * turn on/off a fan, AC, or another object wouldn't be possible.
 */
public class ElectricPowerSwitch {

    public LightBulb lightBulb;
    public boolean on;

    public ElectricPowerSwitch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void press() {
        boolean checkOn = isOn();

        if (checkOn) {
            lightBulb.turnOff();
            this.on = false;
        } else {
            lightBulb.turnOn();
            this.on = true;
        }
    }
}
