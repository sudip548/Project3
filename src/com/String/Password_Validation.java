package com.String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password_Validation {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter The Password");
        String Password=scan.next();
        String regexp="(?=.*[@#$%&])(?=.*[0-9])(?=.*[A-Z]){5,10}" ;
        Pattern p=Pattern.compile(regexp);
        Matcher m=p.matcher(Password);
        System.out.println(m.matches());

    }
}


