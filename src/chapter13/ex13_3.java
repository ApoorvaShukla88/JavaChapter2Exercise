package chapter13;

import java.util.ArrayList;

public class ex13_3 {
    public static void main(String[] args){
        ArrayList<Number> list = new ArrayList<>();

        // Add unsorted numbers to list
        list.add(1);
        list.add(8);
        list.add(2.3);
        list.add(7.43);
        list.add(3);
        list.add(6.246);
        list.add(5);
        list.add(4.6);

        System.out.println(list.toString());

        // Sort list
        sort(list);

        // Display list of sorted numbers
        System.out.println(list.toString());


    }
    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            Number min = list.get(i);
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (min.doubleValue() > list.get(j).doubleValue()) {
                    min = list.get(j);
                    minIndex = j;
                }

            }
            if (minIndex != i) {
                list.set(minIndex, list.get(i));
                list.set(i, min);
            }
        }
    }}
