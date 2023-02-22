package com.Oops;
class S
{
    int i;
    public S () // S() is a default cons
    {
      i=45;
    }
    public S (int i)
    {
        this.i=i;
    }
    public void display()
    {
        System.out.println("i = "+ i);
    }
}
public class Default_Constructor {
    public static void main(String[] args) {
        S s1 = new S();
        s1.display();
        S s2 = new S(100);
        s2.display();
    }
}
