package com.company;
import java.util.Scanner;
public class Alt_series_fibonacci {
    public static void main(String args[]){
        Scanner scn= new Scanner (System.in);
        System.out.println("Enter the num of  alt Fibonacci");
        int n= scn.nextInt();
        int a,b,c;
        a=0;
        b=1;
        c=0;
        if(n<0)
        {
            System.out.println("The number is not valid");
            return;
        }
        System.out.print(a);
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            if(i%2==0) {
                System.out.print(" " + c);
            }
            a=b;
            b=c;
        }
    }
}
