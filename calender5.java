package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class calender5 {
    public static void main(String args[])
    {
        Calendar calNewYork = Calendar.getInstance();
        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New york"));
        System.out.println();
        System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
                + calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));
        System.out.println();
    }
}
