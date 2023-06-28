package com.String;
    interface  Iter
    {
        int i=100;
        void m1();
        void m2();
    }
    class B  implements Iter
    {
        @Override
        public void m1()
        {
            System.out.println("m1()implemented for class B");
        }
        @Override
        public void m2()
        {
            System.out.println("m2()implemented for class B");
        }
        public void m3() //sm
        {
            System.out.println("m3() defined for class B,it is specific method");
        }

    }

    public class InterFaceTest {
    public static void main(String[] args) {
       Iter it=new B();
        it.m1();
        it.m2();

        ((B)it).m3();
        System.out.println(Iter.i);
    }
}
