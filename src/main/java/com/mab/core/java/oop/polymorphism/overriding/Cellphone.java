package com.mab.core.java.oop.polymorphism.overriding;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cellphone extends Device {

    void turnOn() {
        log.info("Turning on cellphone completed successfully");
    }

}
