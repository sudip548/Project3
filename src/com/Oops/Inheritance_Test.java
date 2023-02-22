package com.Oops;
class X
{
    int i=45;
    public void m1()
    {
        System.out.println("Hi, I am method of class X");
        System.out.println("I have the I value which is :"+ i);
    }
}
class Y extends X
{
    int j=100;
    public void m2()
    {
        System.out.println("Hello, I am method of class Y");
        System.out.println("I have the I value which is :"+ j);
    }
}
public class Inheritance_Test {
    public static void main(String[] args) {
        Y y= new Y();
        System.out.println(y.i);
        System.out.println(y.j);
        y.m1();
        y.m2();
    }
}
