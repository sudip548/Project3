package com.Array_List;
import java.util.*;

public class Demo_01 {
    public static void main(String[] args) {
  String s1 =new String("java");
  String s2 =new String("java");
  Map m1= new HashMap();
  m1.put(s1,10);
  System.out.println(m1.get(s2));//10

        Map m2= new IdentityHashMap();
        m2.put(s1,10);
        System.out.println(m2.get(s2));//null
    }
}
