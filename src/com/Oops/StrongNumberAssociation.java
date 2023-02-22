package com.Oops;
import java .util.Scanner;
class Factorial
{
    public int factor(int num)
    {
        int fact=1;
        for( int i=1;i<= num;i++) fact= fact*i;
        return fact;
    }
}
class  Strong
{
    public  int strongLogic(int num) {
        Factorial factorial = new Factorial();
        int res = 0;
        while (num>0)
        {
            int rem = num % 10;
            res= res+ factorial.factor(rem);
            num= num/10;
        }
          return res;
    }
}
public class StrongNumberAssociation {
    public static void main(String[] args) {
        Strong s = new Strong();
        Scanner scn = new Scanner(System.in);
        System.out .println("Num :");
        int num= scn.nextInt();
        if ( num<0) System.out.println(" No Negatives");
        else
        {
       int result = s.strongLogic(num) ;
       if (result == num) System.out.println(" I Am Strong");
       else System.out.println(" I Am Not Strong");
        }
    }
}
