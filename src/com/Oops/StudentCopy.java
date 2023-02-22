package com.Oops;

class Student {
    int sid;
    String name;
    int age;

    public Student(int sid, String name, int age)
    {
      this.sid=sid;
      this.name=name;
      this.age=age;
    }
    public Student( int sid,Student S,int age)
    {
        this.sid=sid;
        this.name= S .name;
        this.age=age;
    }
    public Student(int sid,String name,Student A)
    {
        this .sid=sid;
        this.name = name;
        this. age= A.age;
    }
    public Student(int sid,Student S, Student A)
    {
        this.sid= sid;
        this.name=S.name;
        this.age=A.age;
    }

    public void displayStudents()
    {
        System.out.println("Student Id: "+ sid);
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+ age);
    }
}
public class StudentCopy {
    public static void main(String[] args) {
       Student s1= new Student(1,"Raj",21) ;
       s1.displayStudents();
       Student s2= new Student(2,s1,22);
       s2.displayStudents();
       Student s3= new Student(3,"SuDip",s2);
       s3.displayStudents();
       Student s4= new Student(4,s3,s1);
       s4 .displayStudents();
    }
}
