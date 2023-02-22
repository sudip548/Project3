package com.company;

import java.util.Scanner;

public class Weekdays_break_01
{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter The Day ");
        String day= scn.next().toLowerCase();

        switch (day)
        {
            case "sunday":
                System.out.println("1st");
                break;
            case "monday":
                System.out.println("2nd");
                break;
            case "tuesday":
                System.out.println("3rd");
                break;
            case "wednesday":
                System.out.println("4th");
                break;
            case "thursday":
                System.out.println("5th");
                break;
            case "friday":
                System.out.println("6th");
                break;
            case "saturday":
                System.out.println("7th");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
