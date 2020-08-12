package chapter4;

import java.util.Scanner;

public class intials {
	
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter your First name " );
	String fname = input.next();
	
	System.out.println("Enter your Last name " );
	String lname = input.next();
	
	System.out.println("intials : " +fname.charAt(0) + " "  + lname.charAt(0));
	

	
	
	
		
	}
}