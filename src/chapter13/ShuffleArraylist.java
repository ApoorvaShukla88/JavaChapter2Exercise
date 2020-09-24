package chapter13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ShuffleArraylist {
    public static void main(String[] args){
        ArrayList<Number> list = new ArrayList<>();
        list.add(55);
        list.add(100);
        list.add(150);
        list.add(200);
        System.out.println("List before shuffle : " + list);
        shuffleList(list);
        System.out.println("List after shuffle : " + list);
        
    }
    
    public static void shuffleList(ArrayList<Number> list){
        Collections.shuffle(list);
    }
}

