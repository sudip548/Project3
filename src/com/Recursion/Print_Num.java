package com.Recursion;

public class Print_Num {
    public static void main(String[] args) {
        display(1);
    }
    static void display(int n)
    {
     if(n>10)
     {
         return;
     }
        System.out.println(n);
     display(n+1);
    }
}
       //  ------->  1,2,3,4,5,6,7,8,9,10