package com.Singelton;

class A
{
    private int i;//helper method

    public int getI()   //Getter method/accessor
    {
        return i;
    }
    public void setI(int i)   //Setter method /mutator
    {
        this.i=i;
    }
}
    public class Test {
        public static void main(String[] args) {
            A a1= new A();
            System.out.println(a1.getI());//method to Get value
            a1.setI(25);//method to set the value

            System.out.println(a1.getI());
            a1.setI(45);
        }
}
