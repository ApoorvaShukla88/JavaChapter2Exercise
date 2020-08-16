package chapter5;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		
		int miles = 1;
		double kilometer ;
		
		System.out.println("Miles \t\t Kilometer");
		
		while(miles < 11) {
			kilometer = 1.609 * miles;
			
			System.out.print(miles + "\t\t" );
			System.out.printf("%5.3f" , kilometer);
			System.out.println();
			miles++;
			
		}
		
		
	}
	}