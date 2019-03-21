package com.company.cwiczenia7x;

public class Ship extends Vehicle implements Sailing {

    public Ship(String name) {
        super(name);
    }

    @Override
    public void dock() {
        System.out.println("End of a sad sail");
    }

    @Override
    public double getFuelNeeds() {
        return 100;
    }

    @Override
    public double getDistance() {
        return 600;
    }

    @Override
    public void stop() {
        dock();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
