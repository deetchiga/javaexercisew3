package com.company;

import java.util.Scanner;

public class array6 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] e={ 1,2, 3,4,5};
        int found=0;
        for(int i=0;i<5;i++)
        {
           if(e[i]==a)
           {
               System.out.println(i);
               found++;
           }

           }
        if(found==0)
        {
            System.out.println("notfound");
        }
        else
        {
            System.out.println("found");
        }
    }
}
