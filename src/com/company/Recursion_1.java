package com.company;

import java.util.Scanner;

public class Recursion_1 {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else{
                int product = 1;
                for (int i=1;i<=n;i++){
                    product *= i;
                }
                return product;
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int x = sc.nextInt();
            System.out.println("The value of factorial x is: " + factorial(x));
            System.out.println("The value of factorial x is: " + factorial_iterative(x));
        }
    }


