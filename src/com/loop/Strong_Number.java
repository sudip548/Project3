package com.loop;
import java.util.Scanner;
public class Strong_Number
{
   public static int factorial(int num) {
   int fact=1;
   for(int i=1;i<=num;i++)
   {
       fact=fact*i;
   }
   return fact;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=scan.nextInt();
        if(num<0) System.out.println("No Negatives");
        else{
            int temp=num;
            int res=0;
            while(num>0)
            {
                int rem=num%10;
                res=res+factorial(rem);
                num=num/10;
            }
            if (temp== res) System.out.println("I Am Strong");
            else System.out.println("I Am Not Strong");
        }
    }
}
