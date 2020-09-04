package chapter9;

import java.util.Scanner;

public class ex9_10{
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println(" Enter the value for a : ");
		double a = input.nextDouble();
		System.out.println(" Enter the value for b : ");
		double b = input.nextDouble();
		System.out.println(" Enter the value for c : ");
		double c = input.nextDouble();
		
		QuadraticEq qe = new QuadraticEq();
		double dis = qe.getDiscriminant();
		System.out.println(dis);
		
	}
	
	
}
class QuadraticEq{
	private static double a, b, c, d;
	QuadraticEq(){}
	
	public double getValueOfA () {
		return a;
	}
	public double getValueOfB () {
		return b;
	}
	public double getValueOfC () {
		return c;
	}
	public void setValueOfA (double a) {
		QuadraticEq.a = a;
	}
	public void setValueOfB (double b) {
		QuadraticEq.b = b;
	}
	public void setValueOfC(double c) {
		QuadraticEq.c= c;
	}

	public void setValueOfD (double d) {
		QuadraticEq.d = d;
	}
	
	
	
	public double getDiscriminant() {
		double d = (b*b) - (4*a*c);
		System.out.println(d);
		if(d < 0) {
			return 0;
		}else {
			System.out.println(d);
		return d;
	}}
	
	public double getRoot1() {
		double r1 = ((-b) + Math.sqrt(d)) / 2* a;
		return r1;
		
	}
	public double getRoot2() {
		double r2 = ((-b) + Math.sqrt(d)) / 2* a;
		return r2;
		
	}
	
	
}
