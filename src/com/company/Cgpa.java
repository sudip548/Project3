package com.company;

import java.util.Scanner;

public class Cgpa {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of math");
        int math=sc.nextInt();
        System.out.println("enter the number of phy");
        int phy=sc.nextInt();
        System.out.println("enter the number of ben");
        int ben =sc.nextInt();
        int total =math+phy+ben;
        float cgpa =(total/300.0f)*10.0f;
        System.out.println("your cgpa is "+ cgpa );
    }
}
