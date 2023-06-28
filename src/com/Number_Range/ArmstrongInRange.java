package com.Number_Range;

import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Lower_Limit");
        int a= sc.nextInt();
        System.out.println("Enter the Upper_Limit");
        int b= sc.nextInt();
    for(int i=a;i<=b;i++){
        int n=i;
        int count=0;
        while (n>0){
            count++;
            n/=10;
        }
        n=i;
        int sum=0;
        while (n>0){
            int d=n%10;
            sum+=(int)Math.pow(d,count);
            n/=10;
        }
        if(i==sum){
            System.out.print(i+" ");
        }
      }
    }
}
