package chapter2;

import java.util.Scanner;

public class HealthApp {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the weight in pounds ");
		double weight = input.nextDouble();
		double weightK = weight * 0.453;
		System.out.println("Enter the height in inches :");
		double height = input.nextDouble();
		double heightM = height * 0.0254;
		double bmi = weightK / (heightM * heightM);
		System.out.println("BMI is " + bmi);
		
		
		
		
	}
}