package chapter12;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;



public class ex12_11{
	public static void main(String[] agrs) {

		File file = new File("src/chapter12/ex11.txt");
		try {
			Scanner input = new Scanner(file);
			while(input.hasNext()) {
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		
	}
}
