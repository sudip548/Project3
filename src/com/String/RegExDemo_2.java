package com.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo_2 {
    public static void main(String[] args) {
      Pattern p= Pattern.compile("ab*c") ;
        Matcher m=p.matcher("acabcabbcabc");
        while(m.find()){
            System.out.println(m.start()+","+m.end()+","+ m.group());
        }
    }
}
                             //0,2,ac
                             //2,5,abc
                             //5,9,abbc
                             //9,12,abc