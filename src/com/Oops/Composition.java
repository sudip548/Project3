package com.Oops;
class A2
{
   public void m1()
   {
       System.out.println(" Good Logic");
   }
}
 class B2
 {
     A2 a;
     public B2(A2 a)
     {
         this . a = a;
     }
     public void m2()
     {
         a.m1();
         System.out.println(" Without Good Logic in incomplete");
     }
 }
public class Composition {
    public static void main(String[] args) {
        B2 b= new B2 (new A2());
        b.m2();
    }
}
