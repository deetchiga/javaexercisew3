package com.company;
import java.util.Scanner;

public class farenheit {

        public static void main(String[] Strings) {
            Scanner input = new Scanner(System.in);

            System.out.print("Input in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
            System.out.println(celsius);

    }

}
