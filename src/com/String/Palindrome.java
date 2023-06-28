package com.String;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam",2,6));
    }
    static boolean isPalindrome(String s,int start,int end){
        int i=start,j=end;
        while(i>j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
