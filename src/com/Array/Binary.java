package com.Array;

public class Binary {
    public static void main(String[] args) {
     int[]a={3,4,6,7,8,9,10};
        System.out.println(search(a,9));
        System.out.println(search(a,19));
    }
    public static  int search(int[]a,int ele){
        int start=0,end=a.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(ele==a[mid]) return mid;
            else if (ele<a[mid])end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
}
