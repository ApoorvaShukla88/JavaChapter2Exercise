package chapter4;

import java.util.Scanner;

public class NumberGuessing {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your guess : ");
		
		double guess = input.nextDouble();
		boolean isTrue;
		
		double num = Math.random() * 10 + 1;
		while(guess == num) {
			System.out.println("Guess the Number :");
			int num1 =(int) Math.random() * 10 + 1;
			
			
			
		
				
	}
}}