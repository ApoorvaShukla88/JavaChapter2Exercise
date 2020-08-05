package chapter2;

import java.util.Scanner;

public class VolOfCylinder {
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter length :");
	double length = input.nextDouble();
	System.out.println("Enter radius : ");
	double radius = input.nextDouble();
	
	input.close();
	
	
	double area = (radius * radius) * 3.14;
	double vol = area * length;
	
	System.out.println(" The area is :" + area);
	System.out.println(" The volume is :" + vol);

	
}
}