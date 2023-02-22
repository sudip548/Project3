package com.loop;
import java.util.Scanner;
public class Reverse_Palindrome_number {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = scn.nextInt();
        int temp = num ;
        if(num<0)
        {
            System.out.println("please don't input negatives");
        }
        else {
            int rev=0;
            while (num>0)
            {
//                int rem = num%10;
                rev=(rev*10)+(num%10);
                num=num/10;
            }
            if (temp==rev)
                System.out.println("It is a palindrome Number");
            else
                System.out.println("It is not  a palindrome Number");
            System.out.println(temp+" reverse is "+rev);
        }
    }
}
