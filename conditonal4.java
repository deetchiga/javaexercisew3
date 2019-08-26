package com.company;

import java.util.Scanner;

public class conditonal4 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        if(a==0)
        {
            System.out.println("zero");
        }
        else
        {
            if(a>0)
            { if (a < 1)
            {
                System.out.println("Positive small number");
            }
            else if (a> 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
            }
            else
            {
                if (Math.abs(a) < 1)
                {
                    System.out.println("negative small number");
                }
                else if (Math.abs(a) < 1000000)
                {
                    System.out.println("negative large number");
                }
                else
                {
                    System.out.println("negative number");
                }
            }
        }
    }
}
