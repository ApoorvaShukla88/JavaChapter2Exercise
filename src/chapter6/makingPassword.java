package chapter6;

import java.util.Scanner;

public class makingPassword {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Word : ");
		String strIn = input.next();
		
		
		System.out.println(password(strIn));

		

	}
	
	public static String password(String w) {
		String first = w.charAt(0) + "";
		String last = w.charAt(w.length()-1) + "";
		int num1 = (int) (Math.random()* 5);
		int num2 = (int) (Math.random()* 10);
		
		
//		System.out.print(first + last + num1 + num2);
		return first + last + num1 + num2;
	
	}

	



	}


