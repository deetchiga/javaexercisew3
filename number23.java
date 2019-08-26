package com.company;

import java.util.Scanner;

public class number23 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int f=0;
        for ( int i=2;i<=n/2;n++)
        {
            if(n%i==0)
            {
                if((i*i*i)==n)
                {
                    f=1;
                    System.out.println("perfect cube");
                    break;
                }
                else
                {
                    System.out.println("not a perfect cube");
                    break;
                }
            }
        }
    }
}
