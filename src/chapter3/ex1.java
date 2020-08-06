package chapter3;

import java.util.Scanner;

public class ex1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value a : ");
		double a = input.nextDouble();
		System.out.println("Enter the value b : ");
		double b = input.nextDouble();
		System.out.println("Enter the value c : ");
		double c = input.nextDouble();
		double d = (b * b) - 4 * a * c;
		double droot = Math.pow(d, 0.5);
		double r1 = (-b + droot) / 2 * a;
		double r2 = (-b - droot) / 2 * a;
		
		
		
		if(d > 0) {
			System.out.println("The equation have two roots " + r1 + r2);
			
		}
		if (d < 0) {
			System.out.println("The equation have no real roots ");
			
		}
		if (d == 0) {
			System.out.println("The equation have one real root : " + r1);
			
		}
		
		
		
	}
}