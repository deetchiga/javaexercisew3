package com.company;

import java.util.Scanner;

public class conditional3 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first no");
        int e=s.nextInt();
        System.out.println("enter second no");
        int f=s.nextInt();
        System.out.println("enter third no");
        int g=s.nextInt();
        int a=Math.max(e,f);
        int b=Math.max(a,g);
        System.out.println(b);

    }
}
