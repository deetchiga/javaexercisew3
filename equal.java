package com.company;

import java.util.Scanner;

public class equal {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = in.nextInt();
        System.out.print("Input second number: ");
        int b = in.nextInt();
        System.out.print("Input third number: ");
        int c = in.nextInt();
        System.out.print("Input fourth number: ");
        int d = in.nextInt();
        if (a == b && b == c && c == d)
        {
            System.out.println("Numbers are equal.");
        }
        else
        {
            System.out.println("Numbers are not equal!");
        }
    }
}
