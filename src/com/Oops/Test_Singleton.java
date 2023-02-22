package com.Oops;

class Z
{
    private static Z t=null;
    private Z()
    {

    }
    public static  Z getInstance()
    {
        if(t==null) t=new Z();
        return t;
    }
}
public class Test_Singleton {
    public static void main(String[] args) {
        Z z1 = Z  .getInstance();
        Z z2 = Z  .getInstance();
        Z z3 = Z  .getInstance();

        System.out.println(z1==z2); // True
        System.out.println(z1==z3);// True
        System.out.println(z2==z3);// True
    }
}
