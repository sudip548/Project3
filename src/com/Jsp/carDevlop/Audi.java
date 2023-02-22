package com.Jsp.carDevlop;
    public class Audi extends Car
    {
        @Override
        public void start()
        {
            System.out.println("Button start");
        }

        @Override
        public void accelerate()
        {
            System.out.println("Full clutch drive");
        }

        @Override
        public void stop()
        {
            System.out.println("Button stop");
        }

        public void bluetooth()  // sm
        {
            System.out.println("Sony bluetooth for Audi car installed");
        }

        public void AC() // sm
        {
            System.out.println("BlueStar Ac installed for Audi");
        }

    }


