package com.Array;

public class SpiralPattern {
    public static void main(String[] args) {
    int[][]a=spiral(5);
    for(int []temp:a){
    for(int n: temp){
        System.out.print(n+"\t");
    }
        System.out.println();
    }
    }
        public static int [][]spiral(int size){
           int [][]a=new int[size][size];
           char m='r';
           int r=0,c=-1;
           for(int i=1;i<=size*size;i++){
               switch(m){
                   case'r':
                       c++;
                       a[r][c]=i;
                       if(c==size-1 || a[r][c+1]!=0)m='d';
                       break;
                   case'd':
                       r++;
                       a[r][c]=i;
                       if(r==size-1||a[r+1][c]!=0)m='l';
                       break;
                   case'l':
                       c--;
                       a[r][c]=i;
                       if(c==0||a[r][c-1]!=0)m='u';
                       break;
                   case'u':
                       r--;
                       a[r][c]=i;
                       if(a[r-1][c]!=0)m='r';
                       break;
               }
        }
           return a;
     }
}
