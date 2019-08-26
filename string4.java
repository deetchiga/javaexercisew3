package com.company;

import java.util.Scanner;

public class string4 {
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    String a=s.nextLine();
    System.out.print(vowels(a));
    System.out.println();
}
public static  int vowels(String a) {
    int count = 0;
    for (int i = 0; i < a.length(); i++) {
        if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i'
                || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
            count++;
        }
    }

return count;
}
}
