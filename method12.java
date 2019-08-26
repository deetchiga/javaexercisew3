package com.company;

import java.util.Scanner;

public class method12 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = in.nextInt();
        System.out.println(nn(n));
    }
        public static int nn(int n) {
            for (int i = 0; i <=n; i++) {
                for (int j = 0; j <= n; j++) {
                    System.out.print(n + " ");
                }
                System.out.println();

            }
            return n;
        }
}