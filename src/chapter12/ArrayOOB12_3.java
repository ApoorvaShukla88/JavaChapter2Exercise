package chapter12;


import java.util.*;

public class ArrayOOB12_3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = randomGeneratedNumber();
		System.out.println();
		System.out.println("Enter the Index of the element : ");
		int userInput = input.nextInt();
		System.out.println();
		try {
			if(userInput >= 0 || userInput < 100) {
				System.out.println(a[userInput]);
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Out of Bound");
			
		}
		
		
		
		
		
	}
	
	public static int[] randomGeneratedNumber() {
		int[] myArray = new int[100];
		for(int i = 0; i< 100; i++) {
			myArray[i] = (int) (Math.random() * 100 + 10);
			System.out.print(myArray[i] + " ");
		}
		return myArray;
	}
}
