package com.Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter The number: ");
        Scanner scan =new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(fact(a));
    }
    static int fact(int n)
    {
        if(n==1 || n==0)return 1;
        return n * fact(n-1);
    }
}
             
