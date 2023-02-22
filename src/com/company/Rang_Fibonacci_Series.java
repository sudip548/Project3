package com.company;

public class Rang_Fibonacci_Series {

        static void alternateFib(int n)
        {
            if (n < 0)
                return;
            int a= 0;
            int b = 1;

            System.out.print(a + " ");
            for (int i = 2; i <= n; i++)
            {
                int c =a+b;

                if (i % 2 == 0)
                    System.out.print(c + " ");

                a=b;
              b=c;
            }
        }

        // Driver Code
        public static void main (String[] args)
        {
            int N = 15;
            alternateFib(N);
        }
    }


