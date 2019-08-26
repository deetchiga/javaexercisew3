package com.company;

import java.util.Scanner;

public class datatype9 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = in.nextInt();
        System.out.print("Input second number: ");
        int b = in.nextInt();

        int sum=a+b;
        int sub=a-b;
        int product=a*b;
        int  avg=(a+b)/2;
        int diff=b-a;
        System.out.println("sum"+sum);
        System.out.println("sub"+sub);
        System.out.println("product"+product);
        System.out.println("avg"+avg);
        System.out.println("diff"+diff);
        //if(a>b)
        //{
          //  System.out.println("a is greater"+a);
        //}

        //else
        //{
          //  System.out.println("b is max"+b);
        //}
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
    }

}
