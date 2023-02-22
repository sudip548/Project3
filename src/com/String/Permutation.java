package com.String;

public class Permutation {
    public static void main(String[] args) {
        String s1 = Swap("bac", 0, 2);
        System.out.println(s1);
    }
    static String Swap(String s, int i, int j) {
        char[] a = s.toCharArray();
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return new String(a);
    }
}
