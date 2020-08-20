package chapter2;

import java.util.Scanner;

public class ConvertTemperature {
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter temperature in Celcius :");
	double celcius = input.nextDouble();
	
	double feh = (((9.0 / 5) * celcius )+ 32);
    	
	System.out.println("In Faherengheit is : " + feh);
	
}
}