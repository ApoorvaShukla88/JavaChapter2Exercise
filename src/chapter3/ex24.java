package chapter3;

import java.util.*; // Needed for a Random Number Generator
public class ex24 {
	
	public static void main(String[] args) {
		
		int rank = (int)(Math.random() * 13 + 1);
		
		String r, s = "";
		
		
//		switch(s) {
//		case 1:
//			s = "Spade";
//			break;
//		case 2:
//			s = "Diamond";
//			break;
//		case 3:
//			s = "Club";
//			break;
//		case 4:
//			s = "Heart";
//			break;	
//			}
//			System.out.println("Error");
			
			
			switch(rank) {
			case 1:
				r = "Ace";
				break;
			case 2:
				r = "2";
				break;
			case 3:
				r = "3";
				break;
			case 4:
				r = "4";
				break;	
			case 5:
				r = "5";
				break;
			case 6:
				r = "6";
				break;
			case 7:
				r = "7";
				break;	
			case 8:
				r = "8";
				break;	
			case 9:
				r = "9";
				break;	
			case 10:
				r = "10";
				break;	
			case 11:
				r = "Jack";
				break;	
			case 12:
				r = "Queen";
				break;	
			case 13:
				r = "King";
				break;			
		}
			System.out.println("Card rank is "+ rank);
			
		
		}
		

		
		
		
	}