package com.company;
class A
{
int i=10;
static int count=0;
private A()
   {
    i++;
       count ++;
    System.out.println("Private Constructor executed");
   }
   //helper method
    public static A getInstance()//factory method
    {
        A a= new A();
        return a;
    }
    public void display()
    {
        System.out.println("i= "+i);
    }
}

public class Factory_Test {
    public static void main(String[] args) {
 // A a  =new A();//not accessible since constructor is private
        A a1=A.getInstance();
        a1.display();
        System.out.println(a1);

        A a2=A.getInstance();
        a2.display();
        System.out.println(a2);

        A a3=A.getInstance();
        a3.display();
        System.out.println(a3);


        System.out.println(a1 == a2);
        System.out.println(a1 == a3);
        System.out.println(a2 == a3);
        System.out.println("The Object count is :"+A.count);//3
    }
}
