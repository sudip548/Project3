package com.loop;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int nb= sc.nextInt();
        int t1 = nb;
        int length=0;

        while(t1 !=0)
        {
            length= length+1;
            t1=t1/10;
        }
        int t2= nb;
        int arm=0;
        int rem;
        while(t2 !=0)
        {
            int mul=1;
            rem =t2 % 10;
            for(int i=1;i<=length;i++)
            {
                mul=mul*rem;
            }
            arm= arm+mul;
            t2=t2/10;
        }
        if (arm==nb)
        {
            System.out.println( nb + " is armstrong");
        }
        else
        {
            System.out.println(nb + " is not armstrong number");
        }
    }

}
