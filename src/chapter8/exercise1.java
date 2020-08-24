package chapter8;

import java.util.Scanner;

import java.util.Arrays;

public class exercise1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] aMatrix = new double[3][4];
//		 System.out.println(Arrays.toString(aMatrix));
		System.out.println("Enter a 3-by-4 matrix row by row :");
	
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				aMatrix[i][j] = input.nextDouble();
			}
			
		}
//		System.out.println(aMatrix.toString());
		
		for(int j = 0; j< aMatrix.length; j++) {
			for(int k = 0; k < aMatrix[j].length; k++) {
				System.out.print(aMatrix[j][k]+ " ");
				
			}
		}
		System.out.println();
		
		
		for  (int col = 0; col < aMatrix[0].length; col++) {
			double addedCol = 0;
		for(int row = 0; row < aMatrix.length; row++) {
			//for(int col = 0; col < aMatrix[row].length; col++) {
			addedCol += aMatrix[row][col];
		
		}
		System.out.println("Sum of elments at column " + col + " is " + addedCol);
		}
	
	}
}

//output
//Enter a 3-by-4 matrix row by row :
//1 2 3 4
//1 2 3 4
//1 2 3 4
//1.0 2.0 3.0 4.0 1.0 2.0 3.0 4.0 1.0 2.0 3.0 4.0 
//Sum of elments at column 0 is 3.0
//Sum of elments at column 1 is 6.0
//Sum of elments at column 2 is 9.0
//Sum of elments at column 3 is 12.0
