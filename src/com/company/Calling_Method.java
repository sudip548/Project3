package com.company;

public class Calling_Method {
    public static void main(String[] args) {
        Dipu d = new Dipu();
        System.out.println(d.s);
        System.out.println( d.add(10,20));
        System.out.println( d.add(30,20));
        d.sub(20,10);
    }
}
class Dipu{
    String s = "Sudip";

    public int add(int x, int y){
        int sum = x+y;
        return sum;
    }

    public void sub(int x, int y){
        int subs = x-y;
        System.out.println(subs);
    }


}