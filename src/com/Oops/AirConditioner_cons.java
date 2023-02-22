package com.Oops;

class Ac1
{
    int temperature ;
    public Ac1 ()
    {
        temperature=18;
    }
    public void changeTemp(int temperature)
    {
        this.temperature=temperature;
    }
    public void displayTemp()
    {
        System.out.println("Temperature is : "+temperature);
    }
}
public class AirConditioner_cons {
    public static void main(String[] args) {
        Ac1 ac1=new Ac1();
        ac1.displayTemp();

        Ac1 ac2=new Ac1();
        ac2.displayTemp();

        Ac1 ac3=new Ac1();
        ac3.displayTemp();
        ac3.changeTemp(21);
        ac3.displayTemp();

    }
}
