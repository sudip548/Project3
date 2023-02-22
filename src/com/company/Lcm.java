package com.company;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Number:");
        int n=0;
        int a = scan.nextInt();
        int b= scan.nextInt();
        for(int i=1;i<=a;i++)
        {
            n=b*i;
            if(n%a==0)
            {
                System.out.println(n);
                break;
            }
        }
    }
}
