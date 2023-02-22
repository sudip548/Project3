package com.company;

public class Recursion {


    static void fun1(int n){
        if (n>0){
            System.out.println(n);
            fun1(n-1);
        }
    }
    public static void main(String[] args) {
    int n=4;
    fun1(n);
    }

}

