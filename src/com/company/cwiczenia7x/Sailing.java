package com.company.cwiczenia7x;

public interface Sailing {
    void dock();
    default void sink() {
        System.out.println("Toniemyyyyy!");
    }
}
