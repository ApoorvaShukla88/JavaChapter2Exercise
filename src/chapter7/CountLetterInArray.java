package chapter7;

import java.util.Scanner;

public class CountLetterInArray {
    public static void main(String[] args){
        String s="what is your name is apoorva shukla mishra";
        s=s.replaceAll(" ","");

        String temp="";
        //append unique letter to temp
        for(int i=0;i<s.length();i++){

            if(!temp.toLowerCase().contains(s.charAt(i)+"")){

                temp+=s.charAt(i)+"";

            }

        }
// count the occuernece
        int count=0;

        for(int i=0;i<temp.length();i++){

            for(int j=0;j<s.length();j++)

            {
// get the i as key and take the value from j and count++
                if((temp.charAt(i))==(s.charAt(j)))

                {

                    count++;

                }

            }

            System.out.println("occerance of "+temp.charAt(i)+" is "+count);

            count=0;

        }
}}
