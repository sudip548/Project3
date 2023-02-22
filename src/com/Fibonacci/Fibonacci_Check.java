package com.Fibonacci;
import java.util.Scanner;
public class Fibonacci_Check {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scn.nextInt();
        if(n==0 || n==1){
            System.out.print("fibonacci");
            return;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for(;;){
            c = a + b;
            if(c==n){
                System.out.print("fibonacci");
                break;
            }
            else if (c>n) {
                System.out.print("num is not fibonacci");
                break;
            }
            a=b;
            b=c;
        }
    }
}
