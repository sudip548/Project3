package com.Recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(add(10));
    }
    static int add (int n)
    {
        if(n==1) return 1;
        return n+add (n-1);
    }
}
