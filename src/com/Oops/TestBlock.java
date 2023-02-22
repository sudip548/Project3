package com.Oops;

class T
{
    static  int i;
    int j;

    {
        i++;
        j++;
    }
    {
        i++;
        j++;
    }
}

public class TestBlock
{
    public static void main(String[] args)
    {
       T t1= new T();
        System.out.println(T.i);
        System.out.println(t1.j);

        T t2= new T();
        System.out.println(T.i);
        System.out.println(t2.j);
    }
}
