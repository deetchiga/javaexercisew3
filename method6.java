package com.company;

import java.util.Scanner;

public class method6 {
    public static void main(String args[]) {

        Scanner number = new Scanner(System.in);
        int s = number.nextInt();
        System.out.println(sum(s));
    }

        public static int sum(int s)
        {int sum1=0;
        while(s>0) {
            int n = s % 10;
            sum1 = sum1 + n;
            s = s / 10;
        }

        return  sum1;
    }

}
