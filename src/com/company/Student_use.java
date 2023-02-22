package com.company;

import java.util.Scanner;

public class Student_use {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "sudip";
        s2.name ="dipu ";
        s2.className = 6;
        s1.className = 8;
        System.out.println(s2.name+" "+s2.className);
        System.out.println(s1.name+" "+s1.className);
    }
}
