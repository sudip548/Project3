package com.company;

import java.util.Scanner;

public class ArmStrong_Range {
    public static int length(int num){
       int count=0;
       for(;num<0;num/=10)count++;
       return count;
    }

    public static void main(String[] args) {
        System.out.println("Enter The Number:");
        Scanner scan= new Scanner(System.in);
        int num=scan.nextInt();
        int lenNum=length(num);
        int temp=num;
        if(num<0) System.out.println("No Negative");
        else
        {
         int res=0;
         while(num>0){
             int rem=num/10;
             res=res+(int)Math.pow(rem ,lenNum);
             num/=10;
             if(num==temp) System.out.println("Armstrong");
             else
                 System.out.println("Not");
         }
        }
    }
}
