package com.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExDemo_1 {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("a[01234]");
        Matcher m = p.matcher("a1a2a3a4");
        while(m.find()){
            System.out.println(m.start()+","+m.end()+","+m.group());
        }
    }
}
                    //0,2,a1
                    //2,4,a2
                    //4,6,a3
                    //6,8,a4