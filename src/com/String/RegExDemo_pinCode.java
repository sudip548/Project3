package com.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo_pinCode {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[7][0-9]{5}");
        Matcher m=p.matcher("Sudip938206440Satma721506757`001");
        while(m.find()){
            System.out.println(m.start()+","+m.end()+","+m.group());
        }
    }
}
