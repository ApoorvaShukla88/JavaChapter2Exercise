package chapter21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class ex21_4_countCONsonantsAndVowels {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader file = new FileReader("src/chapter21/vowel.txt");
        int vcounter = 0;
        int ccounter = 0;
        Scanner input = new Scanner(file);
        //for(int i = 0 ; i < 200; i++){
        while(input.hasNext()) {
            String line = input.nextLine();
            String[] charArray = line.split("");
            for (String str: charArray) {
                if (str.charAt(0) == 'A' || str.charAt(0) == 'E' ||
                        str.charAt(0) == 'I' ||
                        str.charAt(0) == 'O' || str.charAt(0) == 'U') {
                    vcounter++;
                }
                else ccounter++;
            }
        }
        System.out.println("No. of vowels are : "+vcounter);
        System.out.println("No. of consonants : "+ccounter);


        Set<Character> vowels = new HashSet<>();
        vowels.addAll(Arrays.asList('A', 'I', 'E', 'O', 'U'));
        if(input.next().charAt(0) == vowels){
            
        }
//        vowels.add('E');
//        vowels.add('I');
//        vowels.add('O');
//        vowels.add('U');
//        int count = 0;
//        while(input.hasNextByte()){
//           if(input.nextByte() )

        }
//        public static void countVowelOrConsonant(){
//            Scanner input = new Scanner(file);
//        char[] letters = inp
//
//
//    }

}
// iterate over all the char
//check if its a vowel or consonant
//count++