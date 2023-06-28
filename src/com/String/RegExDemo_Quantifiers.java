package com.String;
import java .util.regex.Pattern;
import java .util.regex.Matcher;
public class RegExDemo_Quantifiers {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("a+b+");
        Matcher m=p.matcher("abaababbaaabb");
        while(m.find())
        {
            System.out.println(m.start()+","+m.end()+","+m.group());
        }
    }
}
