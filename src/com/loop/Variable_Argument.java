package com.loop;

public class Variable_Argument {
    public static void m1(int...arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        System.out.println("The total is: "+ sum);
        System.out.println("************************");
    }

    public static void main(String[] args) {
        m1(20,15,36);
        m1(45,67);
        m1(25);
        m1();
    }
}
