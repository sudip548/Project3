package com.Oops;
class Ac{
    int temperature;
    public void initTemp()

    {
      temperature=18;
    }
    public void initTemp(int temperature)
    {
      this.temperature=temperature;
    }
    public void displayTemp()
    {
        System.out.println("Temperature  is : "+temperature);
    }
}
public class AirConditioner {
    public static void main(String[] args) {
        Ac ac1= new Ac();
        ac1.initTemp();
        ac1.displayTemp();
        ac1.initTemp(22);
        ac1.displayTemp();


    }
}
