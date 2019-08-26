package com.company;

import java.util.Scanner;

public class String2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String myArray = sc.next();
            System.out.println("string: " + myArray);
            int n = sc.nextInt();
            int idx = myArray.charAt(n);
            System.out.println("The character at position n is " + (char) idx);
        }
}
