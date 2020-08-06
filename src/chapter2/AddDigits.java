package chapter2;

import java.util.Scanner;

public class AddDigits {
	
	public static void main(String[] args) {
		int reminder, sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number between 0 and 1000 :");
		int num = input.nextInt();
		input.close();
		
		while(num > 0) {
			reminder = num % 10;
			sum = sum+ reminder;
			num = num / 10;
		} 
		
		System.out.println(" Sum is :"+ sum);
	}
	
	
	
}