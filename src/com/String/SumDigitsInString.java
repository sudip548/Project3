package com.String;

public class SumDigitsInString {
    public static void main(String[] args) {
        String s="abc123def456";
        int sum=0;
        for(int i=0;i<=s.length()-1;i++);
        {
            char ch = s.charAt(0);

            if (ch >= '0' && ch <= '9') {
                int num = ch - 48;
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
