package com.Oops;
class A
{
    public void m1(byte n)
    {
        System.out.println("I Am Byte Value");
    }
    public void m1()
    {
        System.out.println("I Am Integer Value");
    }
}
public class ClassTest {
    public static void main(String[] args) {
        A a= new A();
        byte b =45;
        a.m1(b);
        a.m1();
    }
}
