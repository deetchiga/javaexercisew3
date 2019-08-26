package com.company;

import java.util.Scanner;

public class multiplicationtable {
public static void main(String args[])
{
    Scanner s= new Scanner(System.in);
    System.out.print("Input a number: ");
    int a = s.nextInt();
    for (int i=0; i< 10; i++){
        System.out.println(a + " x " + (i+1) + " = " + (a* (i+1)));
    }
}
}
