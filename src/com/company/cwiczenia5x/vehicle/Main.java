package com.company.cwiczenia5x.vehicle;

public class Main {
    public static void main(String... args) {
        Vehicle[] v = new Vehicle[5];
        v[0] = new Plane();
        v[1] = new Car();
        v[2] = new Ship();
        v[3] = new Truck();
        v[4] = new RaceCar();

        for(int i = 0; i < v.length; i++) {

            v[i].start();
        }
    }
}
