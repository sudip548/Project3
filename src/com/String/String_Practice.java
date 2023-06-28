package com.String;

public class String_Practice {
    public static void main(String[] args)  {
        System.out.println(add(45646));

   }
    static int add(int n)
    {
        if(n<=9)return n;
        return add (n/10)+(n%10);
    }
}
