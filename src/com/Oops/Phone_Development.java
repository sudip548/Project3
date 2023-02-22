package com.Oops;
import java .util. Scanner;
class Jio
{
    String simName;
    public Jio(String simName)
    {
        this. simName=simName;
    }
    public void callUsingJio()
    {
        System.out.println("Call through "+ simName+"And also use internet ");
    }
}
class Airtel
{
    String simName;
    public Airtel(String simName)
    {
        this.simName= simName;
    }
    public void callUsingAirtel()
    {
        System.out.println("Call through"+simName+"but can not use internet");
    }
}
class Battery
{
    String batteryName;
    public Battery(String batteryName)
    {
        this.batteryName=batteryName;
    }
}
class Phone
{
    String phoneName;
    Jio jio;
    Airtel airtel;
    Battery battery;
    public Phone(String phoneName)
    {
        this.phoneName= phoneName;
    }
    public void call()
    {
        Scanner scan= new Scanner(System. in);
        System.out.println("1 Jio  /n  2.Airtel");
        int simSelect= scan.nextInt();
        switch (simSelect)
        {
            case 1:
                jio = new Jio("Jio");
                jio.callUsingJio();
                break;
            case 2:
                airtel= new Airtel("Airtel");
                airtel.callUsingAirtel();
                break;
        }
    }
}
public class Phone_Development {
    public static void main(String[] args) {
    Battery battery1= new Battery("Lithium-ion");
    Phone phone1= new Phone("Nokia");
    phone1.call();

    }
}
