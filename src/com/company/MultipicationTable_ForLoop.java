package com.company;

import java.util.Scanner;

public class MultipicationTable_ForLoop {
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = scn.nextInt();
        for(int i=1;i<=12;i++)
        {
            System.out.println( n+ " * "+ i +"="+(n*i));
        }
    }
}
