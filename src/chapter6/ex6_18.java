package chapter6;

import java.util.Scanner;

public class ex6_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String pass = input.nextLine();
        System.out.println("Enter the password : " + pass);
        if(checkPassword(pass)){
            System.out.println("Valid password");
        }else {
            System.out.println("Invalid password");
        }
        }



    public static boolean checkPassword(String s){
        int haveDidit = 0;
        if(s.length() > 8){
            if(!s.contains("\\.[]{}()<>*+-=!?^$|")){
                for(int i = 0 ; i < s.length(); i++){
                    if(Character.isDigit(s.charAt(i))){
                        return true;
                    }
                }
            }
        }else{

        }
       return false;
    }
}
