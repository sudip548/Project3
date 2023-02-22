package com.company;

import java.util.Scanner;

public class Factorial_for
{
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter The Factorial number");
        int n= scn.nextInt();
        int fact=1;
        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of " + n +" Is "+ fact);
    }
}
