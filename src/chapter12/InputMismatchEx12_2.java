package chapter12;


import java.util.*;

public class InputMismatchEx12_2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		boolean flag = true;
		do {
			try {

				int num1 = input.nextInt();
				int num2 = input.nextInt();
				int sum = num1 + num2;

				System.out.println("Sum is : " + sum);
				flag = false;
			}
			catch (InputMismatchException e) {
				System.out.println("Error, Please try again");
					flag = false;
			}
		}while(flag);
	}
}
