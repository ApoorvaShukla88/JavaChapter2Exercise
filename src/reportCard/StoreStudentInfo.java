package reportCard;

import java.util.Scanner;

public class StoreStudentInfo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//ReportCard card = new ReportCard();
		ReportCard[] students = new ReportCard[3];
		System.out.println("Enter Student information : ");
		for( int i = 0; i < 3; i++) {
		ReportCard	card = new ReportCard();
		System.out.println("Student NAme :");
		card.name = input.next();
		System.out.println("Math grade : ");
		card.mathGrade = input.nextInt();
		System.out.println("Drievers ed Grade : ");
		card.driverGrade = input.nextInt();
		System.out.println("English Grade : ");
		card.engGrade = input.nextInt();
		students[i] = card;
		}
	for(int j = 0; j<3; j++) {
		
		System.out.print(students[j].name + " ");
		System.out.print(students[j].driverGrade + " ");
		System.out.print(students[j].engGrade + " ");
		System.out.println(students[j].mathGrade );
		
	}
		
		
	}
	
}