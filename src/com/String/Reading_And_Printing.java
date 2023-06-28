package com.String;

import java.util.Scanner;

public class Reading_And_Printing {
    public static void main(String[] args) {
        Scanner os=new Scanner(System.in);
        System.out.println("Enter the Size of an array:");
        int size=os.nextInt();
        int []arr=new int[size];
        System.out.println("enter the arr Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= os.nextInt();
        }
        System.out.println("enter the array elements are :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
