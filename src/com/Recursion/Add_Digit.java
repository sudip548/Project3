package com.Recursion;

import java.util.Scanner;

public class Add_Digit {
    public static void main(String[] args) {
        System.out.println("Enter The number: ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(add(a));
     }
    static  int add (int n)
    {
        if(n<=9)return n;
        return  add(n/10)+(n%10);
    }
}
