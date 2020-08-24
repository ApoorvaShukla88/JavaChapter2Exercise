package chapter7;

import java.util.Scanner;

public class calculateGrade{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the grades :");
//		String grades = input.next();
		int[] iGrade = new int[3];
		
		for(int i = 0; i<3; i++ ) {
			iGrade[i] = input.nextInt();
			
		}
		double sum = 0;
		double avg = 0;
		for(int j = 0; j<iGrade.length; j++ ) {
			sum += iGrade[j];
			avg = sum / iGrade.length;
		}
		System.out.println("Average is : " + avg);
		
		
		
	}
}