package com.company.cwiczenia7x;

public class Car extends Vehicle{

    public Car(String name) {
        super(name);
    }
    public Car(String name,double fuel, double distance) {

        super(name,fuel, distance);
    }
    @Override
    public double getFuelNeeds() {
        return super.getFuelNeeds();
    }

    @Override
    public double getDistance() {
        return 100;
    }
}
