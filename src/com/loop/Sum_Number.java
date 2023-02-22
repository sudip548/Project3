package com.loop;

import java.util.Scanner;

public class Sum_Number {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter The Number");
        int p = scan.nextInt();
        int sum=0;
       while(p>0) {
           int digit = p % 10;
           sum = sum + digit;
           p = p / 10;
       }

         System.out.println("The Number Sum Of :"+sum);
    }
}

