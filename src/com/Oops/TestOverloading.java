package com.Oops;

class Rectangle
{
    int length;
    int breadth;

public void initRect()
{
        length = 5;
        breadth = 8;
        }
 public void  initRect(int num)
 {
   length= num;
   breadth= num;
 }
 public void initRect(int length,int breadth)
 {
     this.length=length;
     this.breadth=breadth;
 }
 public  void area()
 {
     System.out.println("This area is : " +length*breadth);
 }
}
public class TestOverloading {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        r1.initRect();
        r1.area();
        r1.initRect(4);

        Rectangle r2=new Rectangle();
        r2.area();
        r2.initRect(8,5);
        r2.area();
    }
}
