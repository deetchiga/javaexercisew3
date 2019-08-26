package com.company;

import java.util.Calendar;

public class calender7 {
    public static void main(String args[])
    {
        Calendar calendar = Calendar.getInstance();
        System.out.println();
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
