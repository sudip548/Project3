package com.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Malayalam"));
        System.out.println(isPalindrome( "java"));
    }
    static boolean isPalindrome(String s)
    {
    char[]a=s.toLowerCase().toCharArray();
    int i=0,j=a.length-1;
    while(i<j)
    {
        if(a[i]!=a[j]) return false;
        i++;
        j--;
    }
    return true;
    }
}
