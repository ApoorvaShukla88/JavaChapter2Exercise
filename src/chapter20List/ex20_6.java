package chapter20List;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ex20_6 {
    public static void main(String[] args){
        List<Integer> l = new LinkedList<>();
        for(int i = 0; i < 5000000; i++){
           l.add(i);
        }
        long tstartIterator = System.currentTimeMillis();
        for (Integer i: l) {}
        long tendIterator = System.currentTimeMillis();
        System.out.println("Itertor took time : " + (tendIterator - tstartIterator));

        long tgstartIterator = System.currentTimeMillis();
        for(int i = 0; i < l.size(); i++){
            l.get(i);
        }
        long tgendIterator = System.currentTimeMillis();
        System.out.println("Get(i) took time : " + (tgendIterator - tgstartIterator));
    }
}
