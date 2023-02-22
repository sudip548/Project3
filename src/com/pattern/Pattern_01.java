package com.pattern;

import java.util.Scanner;

public class Pattern_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int size= sc.nextInt();
        for(int i= 1;i<=size;i++)
        {
            for(int j=1;j<=size;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
        output:
               *****
               *****
               *****
               *****
               *****
 */
