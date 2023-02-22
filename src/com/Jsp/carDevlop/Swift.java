package com.Jsp.carDevlop;


    public class Swift extends Car
    {
        @Override
        public void start()
        {
            System.out.println("key start");
        }

        @Override
        public void accelerate()
        {
            System.out.println("Half clutch drive");
        }

        @Override
        public void stop()
        {
            System.out.println("key stop");
        }

        public void bluetooth()  // sm
        {
            System.out.println("JBL bluetooth for swift car installed");
        }

    }

