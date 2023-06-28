package com.pattern;

import java.util.Scanner;

public class Diamond_02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int n= sc.nextInt();
        int spaces=n/2;
        int star=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                if(j==star ||j==1)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            if(i<=n/2){
                spaces--;
                star+=2;
            }else{
                spaces++;
                star-=2;
            }
            System.out.println();
        }
    }
}
