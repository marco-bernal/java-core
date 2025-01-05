package com.mab.core.old.oop.polymorphism;

import lombok.extern.slf4j.Slf4j;

//TODO: Add more realistic/useful implementation and unit tests

@Slf4j
public class Overloading {

    void printMessage() {
        log.info("Method overloading, empty parameters and return type");
    }

    String printMessage(String message) {
        log.info("Message entered by user: ", message);
        return message;
    }
}