package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

public class Main {

    public void changeValue(String val) {
        val = "pies";
    }

    public static void main(String[] args) {
	// write your code here

        for(String s : args) {
            System.out.print(s + " ");
        }
        System.out.println(Arrays.toString(args));
        System.out.println("Hello world");
        Hello h1 = new Hello();
        System.out.println("klasa mówi cześć");
        h1.sayHello();
        System.out.println("Wylosowałem : " + Kostka.number());
        //Kostka.shuffleUntil();
        /*
        byte b1 = 127;
        byte b2 = 2;
        int val = 'a';
        long big = 10;
        float dec = 100;
        System.out.printf("%d, %d, %f", big,val, dec);
        */
    }
}
