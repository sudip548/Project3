package com.Oops;
class Addition
{
    public void add(int num)
        {
            System.out.println(num+num);
        }
        public void add(int x,int y)
        {
            System.out.println(x+y);
        }
        public void add(int x,int y,int z)
        {
            System.out.println(x+y+z);
        }
}
public class TestOverloading_01 {
    public static void main(String[] args) {
        Addition addition1= new Addition ();
        addition1.add(4);
        addition1.add(5,6);
        addition1.add(4,3,2);
    }
}
