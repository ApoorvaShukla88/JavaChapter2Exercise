package chapter5;

import java.util.Scanner;

public class exercise5point10 {
	public static void main(String[] args) {
		int counter = 0;
		for(int num = 100 ; num <=1000; num++) {
			if(num % 5 == 0 && num % 6 == 0) {
				System.out.print(num + " ");
					counter++;
					if(counter % 10 == 0) {
						System.out.println("\n");
				}
			}
		}
		
		
		
		
		
		
	}}