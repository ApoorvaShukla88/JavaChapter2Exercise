package chapter3;

import java.util.Scanner;

public class ex8 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers :");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		if(num1 > num2) {
			if(num2 > num3 ) {
				System.out.println("Sorted order is " + num1 + num2 + num3);
			}
			else if (num3 > num2) {
				System.out.println("Sorted order is " + num1 + num3 + num2);
				
			}
			
		}
		else if(num2 > num3) {
			if(num3 > num1) {
				System.out.println("Sorted order is " + num2 + num3 + num1);
			}
			else if(num3 < num1) {
				System.out.println("Sorted order is " + num2 + num1 + num3);
			}
		}
		else if(num3 > num1) {
			if (num1 > num2) {
				System.out.println("Sorted order is " + num3 + num1 + num2);
			}
			else if (num1 < num2) {
				System.out.println("Sorted order is " + num3 + num2 + num1);
			}
		}
		
	}
}