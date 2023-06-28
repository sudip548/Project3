package com.String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_Valid_PhoneNum {
    public static void main(String[] args) {
     Scanner scan= new Scanner(System.in);
        System.out.println("Enter the PhoneNumber:");
        String phoneNum=scan.next();
        Pattern p=Pattern.compile("[6-9][0-9]{9}");
        Matcher m=p.matcher(phoneNum);
        System.out.println(m.matches());
    }
}
