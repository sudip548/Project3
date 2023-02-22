package com.Fibonacci;

import java.util.Scanner;

public class Fibonacci_Rang {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter Lower and upper limit");
        int m= scn.nextInt();
        int n= scn.nextInt();
        int a,b,c;
        a=0;
        b=1;
        c=0;
        if(m==0)
        {
            System.out.println(a+" "+b);
        }
        for(;;)
        {
         c=a+b;
         if(c>n)
            {
                break;
            }
            if(c>=m)
            {
                System.out.println(" "+c);
            }
            a=b;
            b=c;
        }
    }
}
