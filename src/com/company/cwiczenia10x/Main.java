package com.company.cwiczenia10x;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String... args) {
        List<String> e = new ArrayList<>();
        e.add("asd");
        e.add("fgh");

        ExampleInterface ez = new Example();

        ez.go(new Example() {

        });
    }
}

interface ExampleInterface {
    String go(String s, int i);
}

class Example implements ExampleInterface {
    public Example() {}
    @Override
    public String go(String s, int i) {
        return s + i;
    }
}



