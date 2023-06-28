package com.Number_Range;

import java.util.Scanner;

public class StrongNumberInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Lower_Limit");
        int a= sc.nextInt();
        System.out.println("Enter the Upper_Limit");
        int b= sc.nextInt();

        for(int i=a;i<=b;i++){
            int n=i;
            int  sum=0;
            while(n>0){
                int d=n%10;
                int prod=1;
                for(int j=1;j<=d;j++){
                    prod*=j;
                }
                sum+=prod;
                n/=10;
            }
            if(sum==i) System.out.println(i);
        }
    }
}
