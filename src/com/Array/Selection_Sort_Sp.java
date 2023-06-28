package com.Array;

public class Selection_Sort_Sp {
    public static void main(String[] args) {
        int min=0;int temp=0;
        int[]a={4,8,9,7,5,3,1,2,6};
        for(int i=0;i<a.length;i++)
        {
            min=i;
            for(int j=i+1;j< a.length;j++)
            {
                   if(a[j]<a[min])
                   {
                      min= j;
                   }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
