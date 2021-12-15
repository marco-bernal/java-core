package com.mab.core.solid.interface_segregation.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ToyPlane implements Toy, Moveable, Flyable {

    private double price;
    private String color;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void move() {
        log.info("ToyPlane is moving...");
    }

    @Override
    public void fly() {
        log.info("ToyPlane is flying...");
    }

    @Override
    public String toString() {
        return "ToyPlane: Moveable and Flyable Toy plane - Price: " + price + " Color: " + color;
    }
}
