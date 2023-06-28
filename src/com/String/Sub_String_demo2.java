package com.String;

public class Sub_String_demo2 {
    public static void main(String[] args) {
        String s="welcome";
        for(int i=0;i<s.length();i++)
        {
            int j=i+3;
            if(j<=s.length())
            {
                System.out.println(s.substring(i,j));
            }
        }
    }
}
