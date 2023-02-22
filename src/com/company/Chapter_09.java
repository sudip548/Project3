package com.company;

 class Worker{
    private int id;
    private String name;

    public String getName (){
        return name;
    }
    public void setName(String name){
         this.name= name;
    }
     public int getId(){
      return id;
     }
     public void setId(int id){

        this.id=id;
     }
}
public class Chapter_09 {
    public static void main(String[] args) {
    Worker sudip = new Worker();
        sudip.setName("love you");
        System.out.println(sudip.getName());
     sudip.setId(143);
        System.out.println("143");
    }
}
