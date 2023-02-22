package com.Oops;
class Rectangle1
{
 int length;
 int breadth;
    public void initializeArea(int length,int breadth)
    {
        this.length  = length;
        this.breadth = breadth;
    }
    public void displayArea()
    {
        System.out.println("length= this.length"+"breadth= this. breadth");
    }
    public void calculateArea()
    {
        int area = this .length * this.breadth;
        System.out.println("this area is :" + area);
        System.out.println("******************");
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1();
        r1.initializeArea(5, 10);
        r1.displayArea();
        r1.calculateArea();

        Rectangle1 r2 = new Rectangle1();
        r2 .initializeArea(11,8);
        r2 .displayArea();
        r2.calculateArea();
    }
}
