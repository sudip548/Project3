package com.Array;

public class SecondSmallestNum {
    public static void main(String[] args) {
        int[]a={8,2,4,3,6,1,9,7};
        int s1=a[0];
        int s2=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]==s1)continue;;
            if(a[i]<s1){
                s2=s1;
                s1=a[i];
            }
            else if(a[i]<s2||s1>s2){
                s2=a[i];
            }
        }
        System.out.println(s2);
    }
}
