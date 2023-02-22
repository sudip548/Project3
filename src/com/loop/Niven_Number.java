package com.loop;
import java.util.Scanner;

public class  Niven_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num = scn.nextInt();
        if (num < 0)
        {
            System.out.println("no negatives");
        }
        else {
            int sum = 0,temp = num ;
            while (num > 0)
            {
                int rem = num % 10;
                sum = sum + rem;
                num = num / 10;
            }
            if (temp % sum == 0)
            {
                System.out.println("Niven number");
            }
            else {
                System.out.println("Not niven number");
            }
        }
                                      //      7 is niven Number          //
    }
}
