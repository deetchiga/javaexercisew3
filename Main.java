package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a");
        int a=s.nextInt();
        System.out.println("enter b");
        int b=s.nextInt();

        System.out.println("the addition is "+(a+b));
        System.out.println((a-b));
        System.out.println((a*b));
        System.out.println((a/b));


    }
}
