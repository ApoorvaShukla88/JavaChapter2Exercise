package chapter20List;

import java.util.Arrays;
import java.util.Scanner;

public class practise {
    static String pre = "";
    public static void main(String[] args){
        System.out.println(commonPreffix("mining", "timing"));
        int[] list = {1, 2, 3, 5, 6,7 ,8,10, 11, 34, 55};
//        System.out.println(Arrays.toString(shiftElements(list)));
        System.out.println(Arrays.toString(shiftElement(list)));
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

    public static int[] shiftElement(int[] myList){
// Shifting in array rigth to left
        // int[] list = {1, 2, 3, 5, 6,7 ,8,10, 11, 34, 55};
        System.out.println(Arrays.toString(myList));
        int temp = myList[myList.length -1];
//        myList[0] = temp;
        for(int i = 1;i<myList.length-1; i++){
            myList[i-1] = myList[i];// 1>0, 2>1, 3>2....
        }
        myList[0] = temp;
        return myList;
    }

}


