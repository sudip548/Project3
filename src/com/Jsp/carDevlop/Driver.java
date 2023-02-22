package com.Jsp.carDevlop;

public class Driver {

    public void drive(Car car) {
        car.start();
        car.accelerate();
        car.stop();
    }

    public void accessBluetooth(Car car)
    {
        if(car instanceof Swift)
            ((Swift)car).bluetooth();

        if (car instanceof Audi) {
            ((Audi) car).bluetooth();
        }
    }
    public void accessAC(Car car)
    {
        if(car instanceof Audi)
        {
            ((Audi)car).AC();
        }
        if(car instanceof Benz)
        {
            ((Benz)car).AC();
        }

    }

}
