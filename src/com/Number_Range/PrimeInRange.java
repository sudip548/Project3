package com.Number_Range;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Lower_Limit");
        int a= sc.nextInt();
        System.out.println("Enter the Upper_Limit");
        int b= sc.nextInt();

        for(int i=a;i<=b;i++){
            boolean flag=true;
            if(i<=1)
            continue;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag= false;
                    break;
                }
            }
            if(flag){
                System.out.print(i+" ");
            }
        }
    }
}
