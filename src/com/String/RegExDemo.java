package com.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExDemo {
    public static void main(String[] args) {
        Pattern p=Pattern.compile(".");
        Matcher m=p.matcher("java");
        while(m.find()){
            System.out.println(m.start()+","+m.end()+","+m.group());
        }
    }
}
//0,1,j
//1,2,a
//2,3,v
//3,4,a