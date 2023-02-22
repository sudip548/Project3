package com.Jsp.carDevlop;

public class TestDevelopment {
    public static void main(String[] args) {


        Driver driver1 = new Driver();
        driver1.drive(new Swift());

        driver1.accessBluetooth(new Swift());

        System.out.println("************************");

        driver1.drive(new Audi());
        driver1.accessBluetooth(new Audi());
        driver1.accessAC(new Audi());

        System.out.println("************************");

        driver1.drive(new Benz());
        driver1.accessAC(new Benz());

    }
}
