package com.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo_06 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("ab{2,3}ab");
        Matcher m=p.matcher("aabbabbabbababj");
        while(m.find()){
            System.out.println(m.start()+","+ m.end()+","+m.group());
        }
    }
}


