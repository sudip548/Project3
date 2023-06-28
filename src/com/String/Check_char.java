package com.String;

public class Check_char {
    public static void main(String[] args) {
        String s= "developer";
        while(s.length()>0){
            char ch= s.charAt(0);
            String s1=s.replace(ch+"","");
            int count=s.length()-s1.length();
            System.out.print(ch+"="+count+" ");
            s=s1;
        }
    }
}
