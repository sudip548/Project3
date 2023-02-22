package com.company;

import java.util.Scanner;

public class Gcd {
        public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         int a= scan.nextInt();
            System.out.println("Enter The 1st Number  :");
         int b= scan.nextInt();
            System.out.println("Enter The 2nd Number  :");

            for(int i=a;i>=1;i--)
            {
             if(a%i==0 && b%i==0)
             {
                 System.out.println(i);
                 break;
             }

            }
    }
}
