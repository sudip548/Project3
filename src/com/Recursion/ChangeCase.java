package com.Recursion;

public class ChangeCase {
    public static void main(String[] args) {
        String s="DeVAsENA";
        char ch1=' ';
        String temp =" ";
        for (int i=0;i<s.length();i++)
        {
            char ch2 =s.charAt(i);

            if(ch2>'A'&& ch2<='Z')
            {
                ch2 = (char) (ch2 + 32);
            }
            else if (ch2>='a'&& ch2<='z')
            {
              ch2=(char)(ch2-32);
            }
            temp=temp+ch1;
            //temp+=ch2;
        }
        System.out.println(temp);
    }
}
