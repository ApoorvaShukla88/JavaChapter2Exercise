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
		String futureDayOfTheWeek = "";
		
		String day = "";
		
		
		
		if (dayNumber == 0 ) {
			day = "Sunday";
			
		}
		else if(dayNumber == 1){
			day = "Monday";


		}
		else if(dayNumber == 2){
			day = "Tuesday";
			
		}
		else if(dayNumber == 3){
			day = "Wednesday";
			
		}
		else if(dayNumber == 4){
			day = "Thrusday";
			
		}
		else if(dayNumber == 5){
			day = "Friday";
			
		}
		else if(dayNumber == 6){
			day = "Saturday";
			
		}
		
		System.out.println("Today is " + day + "Future day is " + futureDayOfTheWeek);
		
	}
}