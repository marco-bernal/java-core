package com.mab.core.solid.interface_segregation.bad;

public class ToyHouse implements Toy {

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

    //Methods mover and fly are never used, because the implementation doesn't need them
    @Override
    public void move() {

    }

    @Override
    public void fly() {

    }
}
