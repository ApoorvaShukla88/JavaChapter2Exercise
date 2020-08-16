package chapter5;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer (the input ends if it ends with 0) : ");
		int num = input.nextInt();
		
		double sum = 0.0;
		int positivecount = 0;
		int negativecount = 0;
		
		while(num != 0) {
			sum += num;
			if(num > 0 ) {

				positivecount++;
				System.out.println("The number of positives is : " + positivecount);
			}else if (num < 0){

				negativecount++;
				System.out.println("The number of negatives is : " + negativecount);
			}
			System.out.println("Total number of entry is :" + (positivecount + negativecount));
			System.out.println("Enter an integer (the input ends if it ends with 0) : ");
			num = input.nextInt();

		}

		System.out.println("The average is : " + sum / (positivecount + negativecount));
	}
		
		
		
	}
