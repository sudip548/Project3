package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter The 1st Input: ");
        int No1 = Sc.nextInt();
        System.out.println("Enter The 2nd Input: ");
        int No2= Sc.nextInt();
        System.out.println("Enter The Symbol(+,-,*,/)");
        String Sym= Sc.next();
        int res;
        switch(Sym)
        {
            case "+" :
                res =No1+No2;
                System.out.println("The Addition : "+ res);
                break;
                case "-" :
                res =No1-No2;
                System.out.println("The Subtraction : "+ res);
                break;
                case "*" :
                res =No1*No2;
                System.out.println("The Multiplication : "+ res);
                break;
                case "/" :
                res =No1/No2;
                System.out.println("The Division : "+ res);
                break;
                default:
                    System.out.println("Invalid Symbol");
                    break;
        }
    }
}
