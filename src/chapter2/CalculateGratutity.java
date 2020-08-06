package chapter2;
import java.util.*;

public class CalculateGratutity {
	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Enter in subtotal :");
		double total = input.nextDouble();
		System.out.println("Enetr Gratutity rate :");
		double gratutity = input.nextDouble();
		
		double gratutityOfTotal = total * gratutity / 100 ;
		
		System.out.println("The Gratutity is : " + gratutityOfTotal);
		 
		double fullTotal = total + gratutityOfTotal;
		
		System.out.println(" Total is " + fullTotal );
		
		
	
		
	}
}