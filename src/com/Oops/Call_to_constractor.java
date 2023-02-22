package com.Oops;
class P
{
    public  P()
    {
        System.out.println("I Am a no of arg Const");
    }
    public P(int i)
    {
        this();
        System.out.println("I Am a 1 arg Const");
    }
}

public class Call_to_constractor {
    public static void main(String[] args) {
        P a1= new P(10);
    }
}
