package com.company;

import java.util.Scanner;

public class string5 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        int result=a.compareToIgnoreCase(b);
        if( result>0)
        {
            System.out.println("not equal");
        }
        else
        {
            System.out.println("equal");
        }

    }
}
