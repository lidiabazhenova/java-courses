package com.lidiabazhenova;

public class Car extends Vehicle {
    private  int doors;
    private int engineCompacity;

    public Car(String name, int doors, int engineCompacity) {
        super(name);
        this.doors = doors;
        this.engineCompacity = engineCompacity;
    }
    //
}
