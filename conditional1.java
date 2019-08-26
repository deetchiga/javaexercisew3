package com.company;

import java.util.Scanner;

public class conditional1 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first no");
        int n=s.nextInt();

        if(n>0)
        {
            System.out.println("positive");
        }
        else
        {
            System.out.println("negative");
        }

    }
}
