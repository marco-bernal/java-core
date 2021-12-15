package com.mab.core.solid.interface_segregation.bad;

//Bad example of an interface. "God" interface that doesn't separate different behavior, or "roles".
public interface Toy {

    void setPrice(double price);

    void setColor(String color);

    void move();

    void fly();

}
