package com.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo_4 {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("[6-9][0-9]{9}");
        Matcher m=p.matcher("Sudip9382606440Satma721506");
        while(m.find()){
            System.out.println(m.start()+"-"+m.end()+"="+m.group());
        }
    }
}
