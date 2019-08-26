package com.company;

import java.util.Calendar;

public class calender1 {
    public static void main(String args[]) {
        int year = 2016;
        int month = 0;
        int date = 1;
        Calendar c = Calendar.getInstance();
        c.clear();
        System.out.println();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DATE, date);
        System.out.println(c.getTime());

    }
}
