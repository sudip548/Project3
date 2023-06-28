package com.Array;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[]a={3,4,6,7,8,9,10,12};
        System.out.println(search(a,10,0,a.length-1));
        System.out.println(search(a,5,0,a.length-1));
    }
    public static int search(int[]a,int ele,int start,int end){
        if(start>end)return -1;
        int mid =(start+end)/2;
        if(ele==a[mid])
        {
            return mid;
        }
        else if (ele<a[mid])
        {
            return search(a, ele, start, mid-1);
        }
        else{
            return search(a, ele,mid+1, end);
        }
    }
}
