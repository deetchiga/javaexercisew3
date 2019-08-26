package com.company;

import java.util.Scanner;

public class numbers3 {

    public static void main(String args[])

    {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int random_num = n1 + (int)(Math.random() * n2);
        System.out.println(random_num);

    }
}
