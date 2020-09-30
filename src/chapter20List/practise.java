package chapter20List;

import java.util.Arrays;
import java.util.Scanner;

public class practise {
    static String pre = null;
    public static void main(String[] args){
        System.out.println(commonPreffix("mining", "timing"));
        int[] list = {1, 2, 3, 5, 6,7 ,8,10, 11, 34, 55};
        System.out.println(Arrays.toString(shiftElements(list)));

    }

    public static String commonPreffix(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return null;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                pre += s1.charAt(i);
            }
        }
        return pre;

    }
    public static int[] shiftElements(int[] myList){
//    Scanner input = new Scanner(System.in);
//    int n = input.nextInt();

// Shifting in array left to right

        int temp = myList[0];
        for(int i = 1; i< myList.length; i++){
            myList[i-1] = myList[i];
        }
        myList[myList.length - 1] = temp;
      return myList;
    }

    public static int[] shiftElements(int[] myList){
//    Scanner input = new Scanner(System.in);
//    int n = input.nextInt();

// Shifting in array rigth to left

        int temp = myList[0];
        for(int i = 1; i< myList.length; i++){
            myList[i-1] = myList[i];
        }
        myList[myList.length - 1] = temp;
        return myList;
    }

}


