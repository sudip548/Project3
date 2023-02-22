package com.company;

public class For_Each_Loop {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
      /*  for (int i:arr) {
            System.out.println(i);
        }
        {

        }

       */

        System.out.println("using reverse loop");
     /* for (int i=arr.length-1;i>=0;i--){
          System.out.println(arr[i]);
      }
      */
       /* System.out.println("for using for loop");
        for(int element:arr){
            System.out.println(element);
        }
        */
        System.out.println("using for loop");
        for(int i=0;i<arr.length;i++){
            System.out.println(i);
        }
    }
}
