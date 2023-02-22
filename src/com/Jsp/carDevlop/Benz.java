package com.Jsp.carDevlop;


    public class Benz extends Car
    {
        @Override
        public void start()
        {
            System.out.println("Touch start");
        }

        @Override
        public void accelerate()
        {
            System.out.println("Automated drive");
        }

        @Override
        public void stop()
        {
            System.out.println("Touch stop");
        }

        public void AC()  // sm
        {
            System.out.println("LG AC installed form Benz car");
        }


    }

