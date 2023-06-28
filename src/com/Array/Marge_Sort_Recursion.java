package com.Array;
public class Marge_Sort_Recursion {
    public static void main(String[] args) {
     int[] a={7,9,2,5,4,3,6,1,8};
    sort(a);
    for(int n:a){
        System.out.print(n+" ");
    }
    }
    public static void sort(int[]a){
        if(a.length==1)return;
        int[]left=new int[a.length/2];
        int[]right=new int[a.length-left.length];

        for(int i=0;i<left.length;i++)
        {
            left[i]=a[i];
        }
        for(int i=0;i<right.length;i++)
        {
            right[i]=a[i+left.length];
        }

        sort(left);
        sort(right);
        Merge(left,right,a);
    }

    private static void Merge(int[]a, int[]b, int[] c) {

        int i=0,j=0,k=0;

        while(i<a.length&&j<b.length){
           if(a[i]<b[j])
           {
               c[k]=a[i];
               k++;
               i++;
           }
           else{
               c[k]=b[j];
               k++;
               j++;
           }
        }
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }
    }
}
