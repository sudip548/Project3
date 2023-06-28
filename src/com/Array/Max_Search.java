package com.Array;

public class Max_Search {
    public static void main(String[] args) {
        int a[]={7,2,4,6,9,4};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("The maximum Number Is: " + max);
    }
}
