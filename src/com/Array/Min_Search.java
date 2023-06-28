package com.Array;

public class Min_Search {
    public static void main(String[] args) {
        int a[]={7,2,4,6,9,4};
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("The minimum number is: "+ min);
    }
}
