package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingNumberAdding{
	public static void main(String[] args) {
		
		
		try {
			Scanner input = new Scanner(new File("src/chapter12/data2.txt"));
			int total = 0;
			while(input.hasNextInt()) {
				String num = input.next();
//				System.out.println(num);
				total += Integer.parseInt(num);
				 
			}
			System.out.println(total);
			
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
			
		}
	}
}