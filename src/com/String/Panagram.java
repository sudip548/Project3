package com.String;

import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Panagram :");
        String s=sc.nextLine();
        if(panagram(s))
            System.out.println("It is panagram");
        else
            System.out.println("It is not a panagram");

    }
    static  boolean panagram(String s){
        s= s.toLowerCase();
        if(s==null)
            return  false;
        for(char c='a';c<='z';c++)
        {
            if(s.indexOf(c)==-1)
                return  false;
        }
        return  true;
    }
}
