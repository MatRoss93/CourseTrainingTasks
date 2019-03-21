package com.company.cwiczenia7x;

public class Plane extends Vehicle implements Flying{

    public Plane(String name) {
        super(name);
    }
    @Override
    public void takeOff() {
        System.out.println("Fly!");
    }

    @Override
    public void land() {
        System.out.println("Touchdown!");
    }

    @Override
    public void callAirControll() {
        System.out.println("Mejdej, Mejdej!");
    }

    @Override
    public double getFuelNeeds() {
        return 250;
    }

    @Override
    public double getDistance() {
        return 2000;
    }

    @Override
    public void go() {
        super.go();
        takeOff();
    }

    @Override
    public void stop() {
        super.stop();
        land();
    }
}
