package com.company;

import java.util.Scanner;

public class SumOfDigitsAdd_Loop
{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter number of Digits");
        int n= scn.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
           sum=sum+i;
        }
        System.out.println("1 To " + n + " Sum Is " +sum);
    }
}
