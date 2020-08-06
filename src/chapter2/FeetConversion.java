package chapter2;
import java.util.*;

public class FeetConversion {
	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Enter in feets :");
		double feets = input.nextDouble();
		double meters = 0.305 * feets;
		
		System.out.println("In Meters : " + meters);
		
	}
}