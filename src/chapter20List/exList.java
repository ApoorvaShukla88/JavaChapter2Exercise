package chapter20List;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class exList {
    public static void main(String[] args){


        List<Integer> arrayList = new ArrayList<Integer>();
        long t1 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            arrayList.add(0,i);
        }
        long t11 = System.currentTimeMillis();
        System.out.println("Arraylist is : ");
//        System.out.println(arrayList);
        System.out.println("Time to add in arraylist : " + (t11 - t1));


        List<Object> linkedList = new LinkedList<Object>();
        long t2 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++) {
            linkedList.add(0, i);
        }
        long t22 = System.currentTimeMillis();
        System.out.println("LinkedList is : ");
//        System.out.println(linkedList);
        System.out.println("Time to add in arraylist : " + (t11 - t1));
        System.out.println("Time to add in Linkedlist : " + (t22 - t2));
    }

}
