package com.company;

public class Practice_Array {
    public static void main(String[] args) {
        //practice no-1  array
        /*float []marks= {72.3f,45.6f,56.9f,45.9f,65.8f};
        float sum= 0;
        for(float element:marks) {
            sum = sum + element;
        }
           System.out.println("The value of sum"+sum);
     */
        //practice no-2 array
        int[]marks={45+65+98+78+35+34};
        int num = 65;
        boolean isInArray=false;
        for (int element:marks){
            if(num==element){
                isInArray =true;
                break;

            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
      else {
            System.out.println("The value is not present in the array");
        }



    }
}
