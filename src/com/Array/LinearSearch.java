package com.Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[]a={3,8,1,5,4,2,7};
        System.out.println(search(a,8));
        System.out.println(search(a,10));
    }
    public static int search(int[]a,int ele){
        for(int i=0;i<a.length;i++){
            if (ele == a[i])return i;
            }
        return -1;
    }
}
