package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WritingToFile{
	public static void main(String[] args) {
		File file = new File("src/chapter12/data5.txt");
		
		try {
			
			FileWriter output = new FileWriter(file);
			for(int i = 0; i < 20; i++) {
				((FileWriter) output).write((int)Math.random() * 10);
				System.out.println((int)Math.random() * 10);
				
			}
			output.close();
			Scanner input = new Scanner(new File("src/chapter12/data5.txt"));
			int total = 0;
			while(input.hasNextInt()) {
				String num = input.next();
//				System.out.println(num);
				total += Integer.parseInt(num);
			
		}
			System.out.println(total);
			}
		catch(IOException e) {
			System.out.println("File not found");
		}
		
	}
}