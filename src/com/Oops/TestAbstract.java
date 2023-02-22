package com.Oops;


 abstract class W
{
    public void  m1()
    {
        System.out.println("m1 define for a class A ");
    }
    public abstract void m2();
    public abstract void m3();
}
class Q extends W {
    @Override
    public void m2() {
        System.out.println("m2 ()define for class for class B");
    }

    @Override
    public void m3() {
        System.out.println("m3 ()define  for class B");
    }
    public void m4()//Specific method
    {
        System.out.println("m4 () define for class B");
    }

  }

public class TestAbstract {
    public static void main(String[] args) {

        W w=new Q();
        w.m1();
        w.m2();
        w.m3();


      //  B b=(B) a;
        //b.m4 ();
        ((Q)w).m4();
    }
}
