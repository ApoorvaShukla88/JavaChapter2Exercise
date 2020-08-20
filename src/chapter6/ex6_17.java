package chapter6;

import java.util.Scanner;

public class ex6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number for matrix : ");
		int num= input.nextInt();
		printMatrix(num);
		
		
	}
	
	public static void printMatrix(int n) {

		for (int row = 1; row <=n ; row++) {
			for (int col = 1; col <= n; col++) {

				System.out.print((int)(Math.random() * 2));
//				System.out.print();
			}
			
		System.out.println();
		}
	}
	
}