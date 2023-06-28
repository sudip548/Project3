package com.Array;

public class Kth_LargestNumber {
    public static void main(String[] args) {
        int a[]={7,8,6,2,1,3};
     int k=4;
     for(int i=0;i<a.length-1;i++){
         for(int j=i+1;j<a.length;j++){
             if(a[i]<a[j]){
              int temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
             }
         }
         if(a[i]==k-1) {
             System.out.println(k +"Largest element is"+ a[i]);
         }
     }
        System.out.println("<------------------------------->");
     for(int i=0;i<a.length;i++){
         System.out.print(a[i]+" ");
     }
    }
}
