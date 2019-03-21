package com.company.cwiczenia5x.employee;

public class Manager extends Employee{

    public Manager() {
        System.out.println("Konstruktor Manager");
    }

    public static void printSthManager() {
        System.out.println("Blok statyczy Manager");
    }

    public void printInstanceManager() {
        System.out.println("Blok instancji Manager");
    }
}
