package chapter9;

import java.util.*;

public class ex9_10{
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println(" Enter the value for a : ");
		double a = input.nextDouble();
		System.out.println(" Enter the value for b : ");
		double b = input.nextDouble();
		System.out.println(" Enter the value for c : ");
		double c = input.nextDouble();
		
		QuadraticEq qe = new QuadraticEq(a, b, c);
		double dis = qe.getDiscriminant();
		System.out.println("Discriminant is " + dis);
		qe.setDiscriminant(dis);
		String sol = qe.getSolution();
		System.out.println("Solution is " + sol);
		
		
		
	}
	
	
}
class QuadraticEq{
	private static double a, b, c, d;
	
	private static double r1, r2;
	public QuadraticEq(){}
	QuadraticEq(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c= c;
		getDiscriminant();
//		System.out.println(getSolution());
		
	}
	
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

	
	public double getDiscriminant() {
		double dis = (b*b) - (4.0*a*c);
		return dis;
	}
	public void setDiscriminant(double d) {
		this.d = d;
	
	}
	
	public String getSolution() {
		if(d < 0) {
			return "No Roots";
		}else if (d == 0){
			return "One root" + getRoot1();
			}
		else {
		return "Two roots :" + getRoot1() + " and " + getRoot2();
		}
	}
	
	public double getRoot1() {
		double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
		return r1;
		
	}
	public void setRoot1(double r1) {
	QuadraticEq.r1 = r1;
		
	}
	public double getRoot2() {
		double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
		return r2;
		
	}
	public void setRoot2(double r2) {
		QuadraticEq.r2 = r2;
		
	}
	
	
}
