package com.company;

import java.util.Scanner;

public class number12 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int x = n, y, sum = 0;

        while(x>0)
        {
            y = x%10;
            sum = sum + y;
            x = x/10;
        }

        if(n%sum == 0)
            System.out.println(n+" is a Harshad Number.");
        else
            System.out.println(n+" is not a Harshad Number.");
    }
}
