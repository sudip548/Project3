package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IF_number {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            System.out.println("Enter The MATH Number");
            int N1= scn.nextInt();

            System.out.println("Enter The ENG Number");
            int N2= scn.nextInt();

            System.out.println("Enter The HIS Number");
            int N3= scn.nextInt();

            System.out.println("Enter The GEO Number");
            int N4= scn.nextInt();

            System.out.println("Enter The PHY Number");
            int N5= scn.nextInt();

            System.out.println("Enter The CHEM Number");
            int N6= scn.nextInt();

             int total = (N1+N2+N3+N4+N5+N6);
             int percentage=total/6;

             if (percentage >=90){
                 System.out.println("OUTSTANDING");
             }
             else if (percentage>=80) {
                 System.out.println("VERY GOOD");
             }
             else if (percentage>=70) {
                 System.out.println("GOOD");
             }
             else if (percentage>=35) {
                 System.out.println("PASS");
             }
             else{
                 System.out.println("FAIL");
             }
            System.out.println("Your percentage is"+ percentage);
        }
    }
