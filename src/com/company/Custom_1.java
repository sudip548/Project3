package com.company;

public class Custom_1 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee sudip =new Employee( );
        Employee dipu =new Employee( );

        sudip.id=24;
        sudip.salary=50000;
        sudip.name ="sudipanwita";

        dipu.id=13;
        dipu.salary=30000;
        dipu.name ="sudipu";

        sudip.printDetails();
        dipu.printDetails();
        int salary = sudip.getSalary();
        int id= dipu.getSalary();
        System.out.println(salary);
        System.out.println(salary);

    }
}
      class Employee{
    int salary;
    int id;
    String name;

          public void printDetails(){
        System.out.println("my id is"+id);
        System.out.println("my name"+name);
    }
          public int getSalary() {
              return salary;

          }
      }