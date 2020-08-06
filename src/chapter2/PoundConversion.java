package chapter2;
import java.util.*;

public class PoundConversion {
	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Enter in Pounds :");
		double pound = input.nextDouble();
		double kilo = 0.454 * pound;
		
		System.out.println("In Meters : " + kilo);
		
	}
}