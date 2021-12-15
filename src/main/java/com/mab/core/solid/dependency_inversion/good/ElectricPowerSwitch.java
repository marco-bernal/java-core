package com.mab.core.solid.dependency_inversion.good;

/**
 * This example covers all of the SOLID principles. Use it as a guide/template for my own designs whenever possible.
 * In itself the Dependency Inversion principle is a mix of the Liskov and the Open Closed Principles
 * Plus, Single Responsibility is covered and Interface Segregation too
 **/
public class ElectricPowerSwitch implements Switch {

    Switchable client;
    boolean on;

    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void press() {
        boolean checkOn = isOn();

        if (checkOn) {
            client.turnOff();
            this.on = false;
        } else {
            client.turnOn();
            this.on = true;
        }
    }
}
