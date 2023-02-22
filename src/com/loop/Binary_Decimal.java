package com.loop;

import java.util.Scanner;

public class Binary_Decimal {
    public static void main(String[] args) {
        Scanner Scan= new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int m = Scan.nextInt();
         int decimal=0;
         int i=1;
        while(m>0)
        {
            int bit =m%2;
            decimal=(bit*i)+decimal;
            m=m/10;
            i=i*2;
        }
        System.out.println("The Decimal Number Is:"+decimal);
    }
}
