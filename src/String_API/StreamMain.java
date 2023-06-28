package String_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        // Q) Create a List and Filter  all even numbers from list  .

        List<Integer> list1 = List .of(2,9,5,84,10,55);
        List<Integer> list2 =new ArrayList<>();
        list2.add(20);
        list2.add(87);
        list2.add(65);
        list2.add(43);
        list2.add(51);
        List<Integer> list3= Arrays.asList(78,6,5,9,4,89,4,287,24);

        // without stream
        List<Integer> listEven =new ArrayList<>();
        for(Integer i:list1)
        {
            if(i%2==0){
                listEven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listEven);

        //using String Api
//        Stream<Integer> stream =list1.stream();
//        List <Integer> newList=   stream.filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(newList);
//
       List <Integer> newList = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);

    }
}
