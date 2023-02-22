package com.Oops;
class F
{
     int i;
    static int j;
    static
    {
        j=100;
        System.out.println("Hi");
    }
    {
        i=50;
        System.out.println("Hello");
    }
}
public class Test_Blocks
{
public static void main(String[] args)
  {
        F f1= new F();
        F f2= new F();
        F f3= new F();

      System.out.println(F.j);
      System.out.println(f1.i);
      System.out.println(f2.i);
      System.out.println(f3.i);

   }
}
