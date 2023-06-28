package com.company;

public class Selection_sort {

    public static void main(String[] args) {
        int []a={4,7,6,9,8,1,3,2,5};
         sort(a);
         for( int n:a){
             System.out.print(n);
         }
    }
    public static  void sort(int[]a){
        for(int i=0;i<a.length-1;i++){
            int index=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[index])index=j;
            }
            if(i!=index){
                int temp=a[index];
                a[index]=a[i];
                a[i]=temp;
            }
        }
    }
}
