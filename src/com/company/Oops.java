package com.company;


class pen{
    String color;
    String type;

    public void write (){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}

public class Oops {
    public static void main(String[] args) {
pen pen1=new pen();
pen1.color="red";
pen1.type="gel";
pen1.write();
 pen pen2=new pen();
 pen2.color="black";
 pen2.type="ballPen";

    pen1.printColor();
    pen2.printColor();
   pen1.printType();
    pen2.printType();

    }
}
