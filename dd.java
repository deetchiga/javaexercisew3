package com.company;

import java.util.Scanner;

public class dd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter weight");
        double weight = s.nextDouble();
        System.out.print("enter height");
        double height = s.nextDouble();
        double x = weight / height;
        double y = x / height;
        double bmi = y * 1000;
        System.out.print("Body Mass " + bmi);
    }
}