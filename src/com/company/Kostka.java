package com.company;

import java.util.Random;

public class Kostka {

    public Kostka() {

    }
    public static int number() {
        Random rand = new Random();
        return rand.nextInt(6)+1;
    }

    public static void shuffleUntil() {
        Random rand = new Random();
        int i = 0;
        while( i != 6) {
            i = rand.nextInt(6) + 1;
            System.out.printf("%d ", i);
        }
    }
}
