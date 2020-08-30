package chapter12;
import java.util.*;

public class simpleTryCatch{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean flag = true;
		
		do {
			try {
				System.out.println("Enter the number : ");
				int number  = input.nextInt();
				System.out.println("The entered number is : " + number);
				flag = false;
			}
			catch (InputMismatchException ex) {
				System.out.println("Try again , Number is required ");
//				input.nextLine();
			}
		}while(flag);
			
		}
		
		
		
	}
	
