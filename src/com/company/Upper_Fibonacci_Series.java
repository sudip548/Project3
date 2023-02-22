package com.company;
import java.util.Scanner;
public class Upper_Fibonacci_Series
{
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
     for(;;)
     {
         c=a+b;
         if(c>n)
         {
             break;
         }
         System.out.print(" " + c);
         a = b;
         b = c;
     }
    }
}
