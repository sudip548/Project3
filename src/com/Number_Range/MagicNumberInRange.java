package com.Number_Range;

import java.util.Scanner;

public class MagicNumberInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Lower_Limit");
        int a= sc.nextInt();
        System.out.println("Enter the Upper_Limit");
        int b= sc.nextInt();

    for(int i=a;i<=b;i++){
        int n=i;
        int sum;
        do{
            sum=0;
            while (n>0){
                sum+=(n%10);
                n/=10;
            }
            n=sum;
        }while(sum>9);
        if(sum==1){
            System.out.print(i+" ");
        }
      }
   }
}
