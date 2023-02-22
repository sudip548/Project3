package com.company;
import java.util.Scanner;
public class Practice_sc_02 {
   public static void main(String []args){
       Scanner scn= new Scanner (System.in);
       System.out.println("Enter the number");
       int num = scn.nextInt();
       int temp = num;
       int c1 = 0,c2=0,c3=0,c4=0;

       if (num >= 2000){
           c1= num/2000;
           num = num%2000;
       }
       if (num >= 500) {
           c2 = num / 500;
           num = num % 500;
       }
       if (num >= 200) {
           c3 = num / 200;
           num = num % 200;
       }
       if (num >= 100) {
           c4 = num / 100;
           num = num % 100;
       }
       System.out.println("2000 *  "+c1);
       System.out.println("500 * "+c2);
       System.out.println("200 * "+c3);
       System.out.println("100 * "+c4);
   }
}
