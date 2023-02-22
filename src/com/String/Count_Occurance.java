package com.String;

public class Count_Occurance {
    public static void main(String[] args) {
        String s="java";
          String s1=s.replace("a","");
          int count =s.length()-s1.length();
        System.out.println(count);
    }
}
