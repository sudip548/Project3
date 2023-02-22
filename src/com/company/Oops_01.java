package com.company;
class  Boy{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System. out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }
}
public class Oops_01 {
    public static void main(String[] args) {
    Boy  sv =new Boy();
        sv.age=22;
        sv.name= "Sudip";
        sv.printInfo(sv.age+" "+sv.name);
    }

}
