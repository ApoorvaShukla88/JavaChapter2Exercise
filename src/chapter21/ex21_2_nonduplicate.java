package chapter21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class ex21_2_nonduplicate {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader file = new FileReader("src/chapter21/abc.txt");
        Scanner input = new Scanner(file);
        Set<String> words = new TreeSet<String>();
        while(input.hasNext()){
            String tokens = input.next();
            words.add(tokens);
        }
//        System.out.println(words);
        for (String e: words) {
            System.out.print(e + " ");
        }

    }
}
//INPUT = what is your name apoorva what is your name apoorva what is your name apoorva what is your name apoorva
//OUTPUT = apoorva is name what your