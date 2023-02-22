package com.loop;

import java.util.Scanner;

public class Decimal_Binary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Number  ::- ");
        int n = scan.nextInt();
        int binary=0;
        int i=1;
        while(n>0)
        {
            int bit = n%2;
            binary =(bit*i) + binary;
            n = n/2;
            i=i*10;
        }
        System.out.println("Binary Number "+ binary);
    }
}
