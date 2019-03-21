package com.company.cwiczenia3x;

import java.text.Format;
import java.util.Formatter;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Date {

    public int day;
    public int month;
    public int year;

    public Date(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public static Date of(String pattern) {
        String[] s = pattern.split("[-._]");
        int year = Integer.parseInt(s[2]);
        int month = Integer.parseInt(s[1]);
        int day = Integer.parseInt(s[0]);

        return new Date(year, month,day);
    }
}
