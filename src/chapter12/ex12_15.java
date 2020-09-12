package chapter12;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class ex12_15{
	public static void main(String[] args) throws FileNotFoundException{
			
//				Scanner input = new Scanner(new File("src/chapter12/Exercise12_15.txt"));
//			if(.exists()) {
//				System.out.println("File already exists");
//				System.exit(1);
//			}
		File file = new File("src/chapter12/Exercise12_15.txt");
		try {
			if(file.exists()) {
		
				System.out.println("File already exists");
				System.exit(1);
			}
			file.createNewFile();
			PrintWriter output = new PrintWriter(file);
			for(int i = 0; i < 100 ; i++)
			{
			output.print((int)Math.random() * 1000);
			output.print(" ");
			}
			output.close();
		}catch(Exception e) {
		
		}
		
		  Scanner input = new Scanner(file);
		  int[] a = new int[100]; ////
		  int counter = 0; 
		  while(input.hasNextInt()) { 
			  a[counter] = input.nextInt();
			  counter++; 
		  }
		  System.out.println("List before sort "); 
		  for(int j = 0; j < a.length; j++) { 
			  System.out.println(a[j] + " "); 
		  }
		  //sorting the array
		  Arrays.sort(a); 
		  for(int j = 0; j < a.length; j++) { 
			  System.out.println(a[j] + " ");  
		  }
		 			
	}
	
	
	
	
}