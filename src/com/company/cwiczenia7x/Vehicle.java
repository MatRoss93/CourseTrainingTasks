package com.company.cwiczenia7x;

public abstract class Vehicle implements Riding{

    private String name;
    private double fuelNeeds;
    private double distance;

    public Vehicle() {}

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle(String name, double fuel, double distance) {

        this.name = name;
        this.fuelNeeds = fuel;
        this.distance = distance;
    }
    public double getFuelNeeds() {
        return fuelNeeds;
    }
    public double getDistance() {
        return distance;
    }

    public double calculateFuelConsumption() {
        return getFuelNeeds()/getDistance();
    }

    public void go() {
        System.out.println("Drive " + Object.class.getName());
    }

    public void stop() {
        System.out.println("Stop " + Vehicle.class.getSimpleName());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
