package com.Array;

public class Demo_02 {
    public static void main(String[] args) {
        String [] a={"snow","ice","fire","water","land","apple"};
        sort(a);
        for(String s:a){
            System.out.println(s);
        }
        }
        public static void sort (String[] a){
            for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j].compareTo(a[j+1])>0){
                   String temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
                }
            }
            }
        }
    }


