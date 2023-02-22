package com.Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
        System.out.println("Enter the num of Fibonacci");
        int  n= scn.nextInt();
        int a,b,c;
        a=0;
        b=1;
        c=0;
        if(n==1)
        {
            System.out.println(0);
            return;
        }
        System.out.print(a+" "+b);
        for( int i=3; i<=n; i++)
        {
            c=a+b;
            System.out.print(" "+c);
        }



    }
}
