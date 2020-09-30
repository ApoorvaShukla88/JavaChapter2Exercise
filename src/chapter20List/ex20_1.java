package chapter20List;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ex20_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Queue<String> queue = new PriorityQueue<>();
        Scanner input = new Scanner(new File("src/chapter20List/alphabets.txt"));

        while(input.hasNext()){
            String line = input.nextLine();
            for (String s : line.split(" ")) {
                queue.offer(s);
            }
            //queue.offer(input.nextLine());
        }
        System.out.println(queue);
        List<String> l = new ArrayList<String>(queue);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(String.join(" ",l));
//       for(int i = queue.size() - 1; i <= 0; i--){

//            System.out.println(i);

//        }

    }
}





