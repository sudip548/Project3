package com.company;

import java.util.Scanner;

public class Practice_Fibonacci_Series {
        public static void main(String[] args)
        {
            Scanner scn=new Scanner (System.in);
            System.out.println("Enter the Upper limit");
            int n= scn.nextInt();
            int a,b,c;
            a=0;
            b=1;
            c=0;
            System.out.print(a+" "+b);
            for(int i = 2; i <= n; i++)
            {
                c=a+b;
                if(i % 2 == 0){
                    System.out.print(" " + c);
                }

                a = b;
                b = c;
            }
        }
    }


