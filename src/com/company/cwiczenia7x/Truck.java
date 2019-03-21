package com.company.cwiczenia7x;

public class Truck extends Car {

    public Truck(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 20;
    }
}
