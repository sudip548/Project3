package com.loop;

import java.util.Scanner;

public class Sum_Square_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:  ");
        int p = sc.nextInt();

        int sum=0;
        while(p>0)
        {
            int digit=p%10;
            sum= sum + (digit*digit);
            p=p/10;
        }
        System.out.println("The square Number Sum Of :"+sum);
    }
}
