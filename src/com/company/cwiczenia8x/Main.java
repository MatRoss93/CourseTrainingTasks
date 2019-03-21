package com.company.cwiczenia8x;

import java.util.Properties;

public class Main {

    public static void main(String... args) {
        Properties p = System.getProperties();
        p.list(System.out);
        System.out.println(p.toString());
    }
}
