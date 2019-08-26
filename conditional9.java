package com.company;

import java.util.Scanner;

public class conditional9 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int yr=s.nextInt();
        if((yr%4)==0)
        {
            System.out.println();
            if(yr%100==0)
            {
                if(yr%400==0)
                {
                    System.out.println("is a leap year");
                }
            }
            System.out.println("it is a leap year");
        }
        else
        {
            System.out.println("is not a leap year");
        }
    }
}
