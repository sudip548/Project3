package com.Oops;
class Rectangle2 {
    int length;
    int breath;

    public  void Rectangle2 (int length, int breath) {
        this.length = length;
        this.breath = length;
    }
    public void displayArea()
    {
        System.out.println("length= this.length"+"breadth= this. breadth");
    }

    public void calcArea() {
        int area = length * breath;
        System.out.println("This area is : "+ area);
    }
}
    public class RectangleMulti {
    public static void main(String[] args)
    {
      Rectangle2 r1= new Rectangle2();
        r1.displayArea();
        r1.calcArea();
        Rectangle2 r2= new Rectangle2();
        r2.displayArea();
        r2.calcArea();

    }
}
