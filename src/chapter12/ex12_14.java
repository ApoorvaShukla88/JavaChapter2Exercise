package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex12_14{
	public static void main(String[] agrs) {
		Scanner input;
		try {
			input = new Scanner(new File("src/chapter12/ex14.txt"));
			int total = 0;
			double count = 0;
			while(input.hasNext()) {
				total += input.nextInt();
				count++;
			}
			System.out.println("Average of the numbers is : " + total / count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("Enetr the file name to be read : " );
	
		
		
		
		
	}
}

