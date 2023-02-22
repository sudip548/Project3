package com.loop;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter The Number");
        int num= scan.nextInt();
        boolean a = true;
        if(num<=1)
        {
            System.out.println("Not A Prime Number");
            return;
        }
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                a = false;
                break;
            }
        }
        if (a)
            System.out.println("it is prime number");
        else
            System.out.println("it is not prime number");

    }
}
