package com.mab.core.solid.interface_segregation.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ToyCar implements Toy, Moveable {

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
        log.info("ToyCar is moving...");
    }

    @Override
    public String toString() {
        return "ToyCar: Moveable Toy car- Price: " + price + " Color: " + color;
    }
}
