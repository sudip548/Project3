package com.company;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class DAYS_01 {
    public static void main(String[] args) {
        Scanner scn= new Scanner (System.in);
        System.out.println("ENTER THE MONTH");
        int y = scn.nextInt();
        int m= scn.nextInt();
        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
        {
            System.out.println("31 days");
        }
        else if (m==4||m==6||m==9||m==10)
        {
            System.out.println("30 days");
        }
    }
}
