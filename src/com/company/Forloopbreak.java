package com.company;

public class Forloopbreak {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println(i);
            System.out.println("java is a great");
            if (i == 3) {
                System.out.println("Ending the loop");
                break;
            }
        }
    }
}
































