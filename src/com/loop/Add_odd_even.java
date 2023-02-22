package com.loop;

import java.util.Scanner;

public class Add_odd_even {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter The Number:  ");
        int w = scan.nextInt();
        int oddNumber=0;
        int evenNumber=0;
      while(w>0)
        {
            int digit = w% 10;
            if(digit%2==0)
            {
               evenNumber+=digit;
        }
            else
                oddNumber+= digit;

            w/=10;
        }
        System.out.println("even Number "+evenNumber);
        System.out.println("Odd number "+oddNumber);
    }
}
