package chapter20List;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ex20_10 {
    public static void main(String[] args){
        PriorityQueue<String> p1 = new PriorityQueue<>();
        p1.offer("George");
        p1.offer("Jim");
        p1.offer("John");
        p1.offer("Blake");
        p1.offer("Kevin");
        p1.offer("Michael");
        PriorityQueue<String> p2 = new PriorityQueue<>();
        p2.offer("George");
        p2.offer("Katie");
        p2.offer("Kevin");
        p2.offer("Michael");
        p2.offer("Ryan");
        //union
        p2.addAll(p1);
        System.out.println("Union of p1 and p2 : " + p2);
        p2.removeAll(p1);
        PriorityQueue<String> d = new PriorityQueue<>();
        p2.removeAll(p1);
        d.addAll(p2);
        p1.removeAll(p2);
        d.addAll(p1);
        System.out.println("Differnce of p1 and p2 : " + d);
        p2.retainAll(p1);
        System.out.println("Intersection between p1 and p2 : " + p2);
    }
}
