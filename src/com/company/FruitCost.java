package com.company;

import java.util.Scanner;

public class FruitCost {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the fruit name: ");
        String fruit = sc.next();
        System.out.print("Enter the qty: ");
        int qty = sc.nextInt();
        int cost = 0;

        if (fruit.equals("apple")){
            if (qty<10){
                cost = 15*qty;
            }

            else if (qty>=10 && qty<=20){
                cost = 13*qty;
            }
            else if (qty>20){
                cost = 12*qty;
            }
        }

        if (fruit.equals("orange")) {
            if (qty < 20) {
                cost = 8 * qty;
            } else if (qty >= 20) {
                cost = 7 * qty;
            }
        }

        if (fruit.equals("banana")) {
            if (qty < 100) {
                cost = 3 * qty;
            } else if (qty >= 100) {
                cost = 2 * qty;
            }
        }
        System.out.println("Total cost is: " + cost);
    }
}
