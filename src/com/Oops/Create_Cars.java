package com.Oops;

class car
{
    String carName;
    static  int carNo=2413;
    String color;
    static
    {
        System.out.println("**************************WELCOME**************************");
    }

    {
        carNo ++;
    }
    public car(String carName)
    {
        this.carName=carName;
        this.color="Black";
    }
    public car(String carName, String color)
    {
        this.carName=carName;
        this .color = color;
    }
    public void displayCarDetails()
    {
        System.out.println("carName:"+carName);
        System.out.println("carNo :"+ carNo);
        System.out.println("carColor:"+color);
        System.out.println("******************************");
    }
}

public class Create_Cars  {
    public static void main(String[] args) {
        car car1=new car("Swift");
        car1.displayCarDetails();
        car car2=new car("Kia");
        car2.displayCarDetails();

    }
}
