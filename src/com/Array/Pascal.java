package com.Array;

public class Pascal {
    public static void main(String[] args) {
        int [][] a=PascalTriangle(4);
        int Spaces=3;
        for(int[]temp:a ) {
            for (int i = 1; i <= Spaces; i++) {
                System.out.print(" ");
            }
            for (int n : temp) {
                System.out.print(n + " ");
            }
            System.out.println();
            Spaces--;
        }
    }
    public static int[][]PascalTriangle(int size) {
        int[][] a = new int[size][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i + 1];
            for (int j = 0; j < a[i].length; j++) {
                if (j == 0 || i == j) {
                    a[i][j] = i;
                } else {
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                }
            }

        }
        return a;
    }
}
