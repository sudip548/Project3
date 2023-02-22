package com.company;
import java. util.Scanner;
public class Practise_Fibonacci {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=  scn.nextInt();
       System.out.println("Enter the fibonacci number");
       int a=0;
       int b=0;
       int c=1;
       if(n==0)
       {
           System.out.println(0);
           return;
       }
        System.out.println(a+"  "+b);
       for(int i=3;i<=n;i++)
       {
           c=a+b;
           System.out.println(" "+c);
       }
        a = b;
        b = c;

    }
}
