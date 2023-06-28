package com.Array;

public class Smallest_Area {
    public static void main(String[] args) {
        int a[]={5,4,6,7,9,3,8,};
        int small=a[0];
        for(int i=1;i<a.length;i++) {
            if (a[i] <small)small=a[i];
        }
        System.out.println(small);
    }
}
