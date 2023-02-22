package com.company;

import java.util.Scanner;

public class LeapYear_break
{
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter year and month");
        int y= scn.nextInt();
        int m= scn.nextInt();
        switch (m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                if((y%400==0)||(y%4==0)&&(y%4==100))
                {
                    System.out.println("29 days");
                }
                else
                {
                    System.out.println("28 days");
                }
                break;
            default:
                System.out.println("Invalid Month");
        }
    }
}
