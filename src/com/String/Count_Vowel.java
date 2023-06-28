package com.String;

public class Count_Vowel {
    public static void main(String[] args) {
        String  s="Sudip";
        int count=0;
        s= s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println(ch);
                count++;
            }
        }
        System.out.println(count+" Vowels Are present inside "+s);
    }
}
