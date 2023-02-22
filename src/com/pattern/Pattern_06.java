package com.pattern;

import java.util.Scanner;

public class Pattern_06 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter The Size");
        int n= scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/*
           1
           12
           123
           1234
           12345

 */
