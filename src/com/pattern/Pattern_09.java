package com.pattern;

import java.util.Scanner;

public class Pattern_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n=scan.nextInt();

        for(int i=1; i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j);
                if(i==j)
                break;
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }
}
    /*
                6*5*4*3*2*1
                6*5*4*3*2
                6*5*4*3
                6*5*4
                6*5
                6

     */