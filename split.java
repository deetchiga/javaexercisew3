package com.company;

import java.awt.*;
import java.util.Scanner;

public class split {
    public static void main(String args[])

    {
        Scanner number=new Scanner(System.in);
        int s=number.nextInt();
        while (s > 0) {
            System.out.println(s % 10);
            s = s / 10;
        }
    }
}
