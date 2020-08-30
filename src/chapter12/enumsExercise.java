package chapter12;
import java.util.*;
 public class enumsExercise{
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the number for the day : ");
		 int dayNum = input.nextInt();
		 Day days;
		 
		 
		 
		 switch(dayNum) {
		 case 1:
			 days = Day.MONDAY;
			 break;
		 case 2:
			 days = Day.TUESDAY;
			 break;
		 case 3:
			 days = Day.WEDNESDAY;
			 break;
		 case 4:
			 days = Day.THRUSDAY;
			 break;
		 case 5:
			 days = Day.FRIDAY;
			 break;
		 case 6:
			 days = Day.SATURDAY;
			 break;
		 default :
			 days = Day.SUNDAY;
			 break;
		 
		 }
		 System.out.println(days);
		 
		
		 
	 }
	 static enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY};
	 
	 
 }