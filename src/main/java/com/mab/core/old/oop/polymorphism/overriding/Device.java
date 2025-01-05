package com.mab.core.old.oop.polymorphism.overriding;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Device {

    void turnOn() {
        log.info("Turning on device completed successfully");
    }

    void turnOff() {
        log.info("Turning off device completed successfully");
    }
}
