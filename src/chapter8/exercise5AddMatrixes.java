package chapter8;

import java.util.Scanner;

public class exercise5AddMatrixes{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = input.nextInt();
		System.out.println("Enter the number of column : ");
		int col = input.nextInt();
		double[][] aMatrix = new double[row][col];
		double[][] bMatrix = new double[row][col];

		System.out.println("Enter the values for Matrix A : ");
		for(row = 0; row < aMatrix.length; row++) {
			for(col = 0; col < aMatrix[row].length; col++) {
				aMatrix[row][col] = input.nextDouble();


			}
		}

		System.out.println("Enter the values for Matrix B : ");
		for(row = 0; row < bMatrix.length; row++) {
			for(col = 0; col < bMatrix[row].length; col++) {
				bMatrix[row][col] = input.nextDouble();
			}
//			
		}
		
		addMatrix(aMatrix, bMatrix);
		}




	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] addedMatrix = new double[3][3];
		for(int row = 0; row < addedMatrix.length; row++) {
			for(int col = 0; col < addedMatrix[row].length; col++) {
				addedMatrix[row][col] = a[row][col] + b[row][col];
				System.out.print(addedMatrix[row][col]+" ");
			}
			System.out.println();

			}
		return addedMatrix;

	}}