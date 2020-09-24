package chapter11;

import java.util.ArrayList;
import java.util.List;

public class ex11_18_ArrayList {
    public static void main(String[] args){
        System.out.println(toCharacterArray("This is JAVA Training"));

    }


    public static ArrayList<Character> toCharacterArray(String s){
        ArrayList<Character> stringToChar = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++){
            stringToChar.add(s.charAt(i));
        }
        return stringToChar;
    }

}
