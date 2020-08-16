package chapter5;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		
		int tuition = 10000;
		int newTuition = 0;
		int fourYearOfTuition = 0;
		final float RATE = (float) 0.05;
		int years = 10;
		int newYears = 4;
		
		for(int i = 1; i <= 10; i++) {
			newTuition = (int) (tuition * Math.pow((1 + RATE), years)); 
		}
		
		System.out.println("Tuition in 10 years " + newTuition);
		for(int i= 1; i <= 4; i++) {
			fourYearOfTuition = (int) (newTuition * Math.pow((1 + RATE), newYears)); 
			
		}
		System.out.println("After 10th year 4 year of tuition will cost : "+ fourYearOfTuition);
		
		
	}}