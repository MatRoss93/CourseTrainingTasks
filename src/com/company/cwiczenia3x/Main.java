package com.company.cwiczenia3x;

import java.util.Formatter;

public class Main {
    int var = 10;
    public final int ZMIENNA;
    public Main() {
        ZMIENNA=1000;
    }
    public Main(int var) {
        ZMIENNA=1000;
        this.var = var;
    }

    public int getVar() {
        return this.var;
    }

    public void method() {
        int methodVar = 10;
        System.out.println("Zmienna w metodzie method(): " + methodVar);
        int i = 0;
        while(i < 1) {
            int blockVar = 30;
            methodVar = blockVar;
            System.out.println("Zmienna w metodzie method() w bloku while: " + methodVar);
            i++;
        }

        System.out.println("Zmienna w metodzie method() po bloku while: " + methodVar);
    }

    public void method(int var) {
        var = var;
    }

    public int method2(int var2) {
        return var2;
    }
    public static void main(String... args) {

        Date start = new Date(2015, 7, 23);
        Date end = new Date(2017, 7, 11);
        System.out.println("start " + start.toString());
        System.out.println("end " + end.toString());
        Date today = start;
        System.out.println("today " +today.toString());
        today.day = 17;
        today.year = 2016;
        System.out.println("Po zmianie parametrów przez obiekt today");
        System.out.println("start " + start.toString());
        System.out.println("today " + today.toString());
        end = today;
        System.out.println("end " + end.toString());
        Date d = Date.of("10.11.2001");
        System.out.println(d.toString());
    }
}
