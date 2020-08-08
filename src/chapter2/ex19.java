package chapter2;

import java.util.Scanner;

public class ex19 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three points of triangle : ");
		System.out.println("Enter x1 :" );
		int x1 = scan.nextInt();
		
		System.out.println("Enter y1 :");
		int y1 = scan.nextInt();
		
		System.out.println("Enter x2 :" );
		int x2 = scan.nextInt();
		
		System.out.println("Enter y2 :");
		int y2 = scan.nextInt();
		
		System.out.println("Enter x3 :" );
		int x3 = scan.nextInt();
		
		System.out.println("Enter y3 :");
		int y3 = scan.nextInt();
		
		double iSide1 = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))); 
		double iSide2 = Math.sqrt(((x3 - x1) * (x3 - x1)) + ((y3 - y1) * (y3 - y1))); 
		double iSide3 = Math.sqrt(((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2))); 
		
		double iS = (iSide1 + iSide2 + iSide3) / 2;
		
		double area = Math.sqrt((iS * ( iS - iSide1) * ( iS - iSide2) * (iS - iSide3)));
		
		
		System.out.println("Area of a triangle is : " + area);
		
		
		
		
	}
}
