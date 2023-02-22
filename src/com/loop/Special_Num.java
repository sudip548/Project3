package com.loop;
//it is not complete
import java.util.Scanner;

public class Special_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();
        int temp = num;
        int sum=0;

        for(;num>0; num/=10)
        {
            int rem=num%10;
            sum= sum+rem;
        }
        System.out.println(sum);
        int temp2=sum;
        int rev=0;
        for(;num>0; num/=10)
        {
            rev= sum % 10;
            System.out.println(rev);
        }
    }
}
