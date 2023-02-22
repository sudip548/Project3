package com.Oops;
class Flip
{
    static int count=0;
    public Flip()
    {
        count++;
    }
}

public class Object_count {
    public static void main(String[] args) {
        Flip c1=new Flip();
        Flip c2=new Flip();
        Flip c3=new Flip();
        System.out.println("The Objects count is :"+Flip.count);
    }
}
