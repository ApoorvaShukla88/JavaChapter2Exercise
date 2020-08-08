package chapter3;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter todays date : ");
		int dayNumber = input.nextInt();
		System.out.println("Enter the number of days elapsed since today : ");
		int elapsedDay = input.nextInt();
		
		
		int futureDay = (dayNumber + elapsedDay) % 7;
		
		
		String day;
		String futureDayOfWeek;
		
		switch(dayNumber) {
		case 0:
			day = "Sunday";
			break;
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thrusday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		default :
			day = "Error";
		}
		
		switch(futureDay) {
		case 0:
			futureDayOfWeek = "Sunday";
			break;
		case 1:
			futureDayOfWeek = "Monday";
			break;
		case 2:
			futureDayOfWeek = "Tuesday";
			break;
		case 3:
			futureDayOfWeek = "Wednesday";
			break;
		case 4:
			futureDayOfWeek = "Thrusday";
			break;
		case 5:
			futureDayOfWeek = "Friday";
			break;
		case 6:
			futureDayOfWeek = "Saturday";
			break;
		default :
			futureDayOfWeek = "Error";
		}
		
		
		System.out.println("Todays day " + day + "future day is " + futureDayOfWeek);
		
			
			
			
			
			
		}

	}
