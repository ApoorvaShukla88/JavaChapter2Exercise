package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class exercise15{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] myArray = new int[5];
		 System.out.println(Arrays.toString(myArray));
		 System.out.println("Enter 10 Numbers : " );
		 for(int i = 0; i < myArray.length; i++) {
			 myArray[i] = input.nextInt();
		 }
		 System.out.println(Arrays.toString(myArray));
		 
		  int[] tempArray = eliminateDuplicates(myArray);
		  System.out.println(Arrays.toString(tempArray));

	
}
public static int[] eliminateDuplicates(int[] array){
	int[] uniqueArrayElements = new int[array.length];
	
	int found = 0;
	int index = 0;
	for(int i = 0; i< array.length-1; i++) {
		boolean flag = false;
		for(int j = 0; j < uniqueArrayElements.length-1; j++) {
			if(array[i] != uniqueArrayElements[j]) {
				flag  = true;
				found = array[i];
				System.out.println("Index : " + i + " Value : " + array[i]);
			} 
			if (flag) {
				uniqueArrayElements[index++] = found;
			}
	}

	
	
	
}
	return uniqueArrayElements;
}}