package com.company;

import java.util.Scanner;

public class ss {

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("numbers:");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        int sum=n1+n2+n3/3;
        System.out.println(sum);
    }
}
