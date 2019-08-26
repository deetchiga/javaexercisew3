package com.company;

import java.util.Scanner;

public class datatype3 {

    public static void main(String args[]) {
        int sum=0;
        Scanner number = new Scanner(System.in);
        int s = number.nextInt();
        while(s>0) {
            int n = s % 10;
            sum = sum + n;
            s = s / 10;
        }
        System.out.println(sum);
    }

}

