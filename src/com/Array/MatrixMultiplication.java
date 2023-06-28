package com.Array;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int [][] a={
                {1,2,3},
                {4,5,6},
                {7,8,9}
                };
        int [][] b={
                {1,2,3},
                {4,5,6},
                {7,8,9}
                };
        int len=a.length;
        int[][]c=new int[len][len];
        multiply(a,b,c);
        displayMatrix(c);
    }
    public static void multiply(int[][]a,int[][]b,int[][]c){
        int len =a.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                for(int k=0;k<len;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
    }
    public static void displayMatrix(int [][]a){
        for(int[] temp:a){
            for(int n:temp){
                System.out.print(n+"\t");
            }
            System.out.println();
        }
    }
}
