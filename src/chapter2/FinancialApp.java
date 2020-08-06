package chapter2;

import java.util.Scanner;

public class FinancialApp {
	
	public static void main(String[] args) {
		// Calculate intrest
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the balance and intrest rate ");
		double bal = input.nextDouble();
		float rate = input.nextFloat();
		float intrest = (float) (bal * rate / 1200) ;
		System.out.println(" Intrest is : " + intrest);
		
		
		
		
		
	}
}