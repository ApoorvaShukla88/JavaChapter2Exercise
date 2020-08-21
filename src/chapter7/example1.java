package chapter7;

import java.util.Scanner;

public class example1 {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers :");
		
		int i;
		int sum = 0;
		
		int[] myNewArray = new int[5];
		
		for(i = 0 ; i < myNewArray.length; i++) {
			System.out.println("Enter a " + i + " number");
			int number = input.nextInt();
			myNewArray[i] = number;
			System.out.print(myNewArray[i] + " ");
		}
		
		for(i = 0 ; i < myNewArray.length; i++) {
			sum += myNewArray[i];
			
			
		}
		float avg = (float)(sum / myNewArray.length);
		System.out.println("Average is : " + avg);
		
		
		
	}
	
}