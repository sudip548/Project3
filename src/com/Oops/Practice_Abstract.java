package com.Oops;

abstract class Vehicle
{
public abstract int getNoOfWheels();
}
class Bus extends  Vehicle {
    public int getNoOfWheels() {
        return 6;
    }
}
class Auto extends  Vehicle {
    public int getNoOfWheels() {
        return 3;
    }
}
public class Practice_Abstract {
    public static void main(String[] args) {
        Bus b=new Bus();
        System.out.println(b.getNoOfWheels());
        Auto a =new Auto();
        System.out.println(a.getNoOfWheels());
    }
}
