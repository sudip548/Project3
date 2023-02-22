package com.company;
public class Practice_1 {
    public static void main(String[] args) {
        System.out.println(add(5));
       }
       static int add(int n)
       {
           if(n==1)return n;
           return n+add(n-1);
       }
}


