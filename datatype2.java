package com.company;

import java.util.Scanner;

public class datatype2 {
    public static void main(String args[])
    {
        double a;
        double c=0.0254;
        Scanner number = new Scanner(System.in);
        System.out.println("enter in inches");
        a = number.nextInt();
        double meters=a*c;
        System.out.println(meters);
    }

}
