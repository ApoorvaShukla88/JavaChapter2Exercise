package chapter12;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class ex12_15{
	public static void main(String[] agrs) throws Exception{
			
//				Scanner input = new Scanner(new File("src/chapter12/Exercise12_15.txt"));
//			if(.exists()) {
//				System.out.println("File already exists");
//				System.exit(1);
//			}
		File file = new File("src/chapter12/Exercise12_15.txt");
		try {
			if(file.exists()) 
		
		System.out.println("File already exists");
		System.exit(1);
		}catch(Exception e) {
			
		}
			PrintWriter output = new PrintWriter(file);
			for(int i = 0; i < 100 ; i++)
			{
			output.print((int)Math.random() * 1000);
			output.print(" ");
			}
//			output.close();
			
			Scanner input = new Scanner(file);
			while(input.hasNext()) {
				int numbers = input.nextInt();
				int[] myArray = 
				
				
				
				
				
				
			}
	}
	
	
	
	
}