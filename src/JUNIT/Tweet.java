package JUNIT;

import java.util.Scanner;

public class Tweet{
	
	private String message = "";
	
	
	
	public void addLetter(char c) {
		message += c;
		
		if(message.length() > 140) {
			System.out.println("Cant add more letter");
			System.exit(1);
		}
		
	}
	
	public void deleteletter(char c) {
		message  = message.substring(0, message.length() -2);
		
	}
	
	public String getMessage() {
		return this.message;
		
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the message");
		char a = input.next().charAt(0);
		Tweet t = new Tweet();
		t.addLetter(a);
		System.out.println(t.getMessage());
		
		
//		System.out.print(t.addLetter(a));
		
	}
	
	
	
	
}