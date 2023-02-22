package com.Oops;

import org.w3c.dom.ls.LSOutput;

class a1{
    public  static void m1()
    {
        System.out.println("welcome");
    }
    public static void m1(String name)
    {
        System.out.println("welcome"+name);
    }
    public static void m1(int num)
    {
        System.out.println("the number is: "+num);
    }
}

public class StaticOverload {
    public static void main(String[] args) {
        a1.m1();
        a1.m1("Sudip");
        a1.m1(100);

    }
}
