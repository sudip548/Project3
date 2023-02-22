package com.Oops;
class A1 {
    public  void m1()
        {
            System.out.println("Good logic");
        }
    }
    class B {
    A a;
    public void m2()
    {
       a = new A () ;
        a.m1();
        System.out.println("Without Good Logic in imComplete");
    }
    }
public class Aggregation {
    public static void main(String[] args) {
          B b= new B();
          b.m2();
    }
}
