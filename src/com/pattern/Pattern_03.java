package com.pattern;

import java.util.Scanner;

public class Pattern_03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Size");
        int n= scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
/*

                     1
                     22
                     333
                     4444
                     55555
                     666666
                     7777777
                     88888888
                     999999999
                     10101010101010101010

 */