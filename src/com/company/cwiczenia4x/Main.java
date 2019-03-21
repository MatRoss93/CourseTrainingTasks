package com.company.cwiczenia4x;

public class Main {
    public static boolean isLeapYear(int year) {
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
    public static void main(String... args) {
        // lata przestępne
        /*
        int[] dates = {2012, 2010, 2008, 2000, 1996, 1993, 1804};
        for(int i = 0; i < dates.length; i++) {
            System.out.println(isLeapYear(dates[i]) ? "Tak" : "Nie");
        }
        */

        // for-each dla tablicy wielowymiarowej
        String msg [][] = {{"ala", "ola", "ela"},
                {"kot", "pies"}};

        for(String s[]: msg) {
            for(String s1: s) {
                System.out.println(s1);
            }
        }

        // Cwiczenie 4.3



        //Cwiczenie 4.4
        int start = 1234;
        int end = 2345;
        int[] ileLiczb = new int[5];
        int[] dzielniki = {7,13,29,43};
        for(int i = start; i <= end; i++) {
            int counter = 0;
            for(int z : dzielniki) {
                if(i % z == 0)
                    counter++;
            }

            if(i % 7 == 0)
                ileLiczb[0]++;
            if(i % 13 == 0)
                ileLiczb[1]++;
            if(i % 29 == 0)
                ileLiczb[2]++;
            if(i % 43 == 0)
                ileLiczb[3]++;
            if(counter >= 1)
                ileLiczb[4]++;
        }
        for(int i : ileLiczb) {
            System.out.println(i);
        }

        //Cwiczenie 4.5 Prime nums- zakres jak  w poprzednim cwiczeniu

        int[] dzielniki2 = {2,3,5,7};
        for(int z: dzielniki2) {
            System.out.print(z + " ");
        }
        for(int i = 1; i <= 100; i++) {
            int counter = 0;
            int ileLiczb2 = 0;
            for(int z : dzielniki2) {

                if (i % z == 0)
                    counter++;
            }
            if(counter == 0 && i != 1) {
                ileLiczb2++;
                System.out.print(i + " ");
            }
        }
    }
}
