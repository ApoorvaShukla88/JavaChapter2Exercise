package chapter5;

import java.util.Scanner;

public class ex5point3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		double amt = input.nextDouble();
		System.out.println("Intrest rate : ");
		double intrest = input.nextDouble();
		double intrestPerMonth = intrest / 1200 ;
		System.out.println("Number of months : ");
		double noOfMonths = input.nextDouble() ;
		
		double savings = amt * (1 + intrestPerMonth );
		double amountInSavings = savings * noOfMonths;
		
		
		System.out.println("Amount in savings is : " + amountInSavings);
		
		
		
	}
}