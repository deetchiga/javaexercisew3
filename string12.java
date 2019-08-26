package com.company;

import java.util.Scanner;

public class string12 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();

        String end="ss";
        boolean result=a.endsWith(end);
        System.out.println(result);
    }
}
