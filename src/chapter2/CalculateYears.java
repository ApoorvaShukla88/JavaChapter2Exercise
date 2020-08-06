package chapter2;

import java.util.Scanner;

public class CalculateYears {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of minuters :");
		double min = input.nextInt();
		
		double hours = min / 60 ;
		double days = hours / 24;
		double year = days / 365 ;
		double remainingDays = days % 365;
		
		System.out.println("Number of years are : " + year + "Number of days :" + remainingDays );
				
		
		
	}
}