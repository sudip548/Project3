package com.loop;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner  scan= new Scanner(System.in);
        System.out.println("Enter The Number");
        int sum=0;
        int n=scan.nextInt();
        //int temp = n;
        for(int i=1;i<=n/2;i++)
        {
            if ( n % i==0)
            {
               sum = sum+i;
            }
        }

        if(n==sum)
        {
            System.out.println("this is perfect number");
        }
        else{
            System.out.println(" not perfect");
        }
    }
}
