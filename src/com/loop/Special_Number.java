package com.loop;

import java.util.Scanner;

public class Special_Number {
// It is not  out put found
        public static void main(String[] args) {
            Scanner s1=new Scanner(System.in);
            System.out.println("Enter the Number : ");
            int num=s1.nextInt();
            int Temp=num, sum=0,rem;
            while(Temp>0)
            {
                rem=Temp%10;
                sum=sum+rem;
                Temp=Temp/10;
            }
            System.out.println(sum);
            int TempSum=sum;

            int reverse=0;
            while(sum>0) {
                rem=sum%10;
                reverse=reverse*10+rem;
                sum=sum/10;
            }
            System.out.println(reverse);
            if(reverse*TempSum==num) {
                System.out.print(reverse+" x "+TempSum+" = "+num+ "   Hence:- Special Number ");
            }
            else {
                System.out.println("Not Special Number");
            }
        }

    }

