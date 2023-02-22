package com.Recursion;

public class Recursion_1 {
    public static void main(String[] args) {
       m1(1);
    }
    static void m1(int i)
    {
        System.out.println(i);

        if (i==3) return;
        m1(i);
        System.out.println("m1 ends");
    }
}
