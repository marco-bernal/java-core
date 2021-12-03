package com.mab.core.java.oop.polymorphism;

import lombok.extern.slf4j.Slf4j;

//TODO: Add unit tests


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