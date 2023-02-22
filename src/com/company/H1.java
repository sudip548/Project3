package com.company;
class H{
    static  int a=10;
            int b=20;
}
public class H1 {
    public static void main(String[]args){
        H h=new H();
        System.out.println(h.a);
        System.out.println(h.b);
      h.a=30;
      h.b=40;
        System.out.println(h.a);
        System.out.println(h.b);

        H h1= new H();
        h1.a=100;
        h1.b=200;
        System.out.println(h1.a);
        System.out.println(h1.b);
    }
}
