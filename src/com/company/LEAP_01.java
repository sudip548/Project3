package com.company;

import java.util.Scanner;

public class LEAP_01 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter The Year");
        int year = scn.nextInt();
        if ((year%400==0 )||(year%4==0) && (year%100!=0))
        {
            System.out.println(year+" IS LEAP YEAR");
        }
        else
        {
            System.out.println(year+" IS NOT LEAP YEAR");
        }
    }
}
