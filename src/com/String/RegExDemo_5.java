package com.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo_5 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[a-z][a-z//1]");
        Matcher m=p.matcher("rbbraaanajhj");
        while(m.find()){
            System.out.println(m.start()+","+ m.end()+","+m.group());
        }
    }
}
