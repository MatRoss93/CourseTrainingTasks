package com.company.cwiczenia7x;

public class Test {

    public static void main(String... args) {
        Vehicle[] v = new Vehicle[5];
        v[0] = new Car("samochód");
        v[1] = new Ship("statek");
        v[2] = new Plane("samolot");
        v[3] = new RaceCar("wyścigówka");
        v[4] = new Truck("ciężarówka");

        for(Vehicle veh : v ) {
            System.out.println(veh.toString());
            System.out.println(veh.calculateFuelConsumption() + " l/km");
            veh.go();
            veh.stop();
            if(veh instanceof Flying) {
                ((Flying) veh).callAirControll();

            }
        }
    }
}
