package chapter7;

import java.util.Scanner;

public class classProblems {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
		double[] myNewArray = new double[10]; 
		
		
	
		for(int i= 0; i < myNewArray.length; i++) {	
		System.out.println("Enter 10 numbers :");
		myNewArray[i] = input.nextInt();
		}
		System.out.println(indexOfSmallestElement(myNewArray));
		}
	
		public static int indexOfSmallestElement(double[] array) {
		int index = 0;
		double smallestElement = array[0];
		for(int j=0; j <= array.length; j++) {
			if (smallestElement > array[j])   
            {  
				smallestElement = array[j];  
				index = j;
            }
		}
		
			return index;
					
		
		
	}
		
		

	
}