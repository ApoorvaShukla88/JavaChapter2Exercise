package chapter4;

import java.util.Scanner;

public class ex15 {
	
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	int number = 1;
	System.out.println("Enter a letter : ");
	
	String l1 = input.nextLine();
	char letter = l1.charAt(0);
	
	
	  switch (letter) {
      case 'A':
      case 'B':
      case 'C':
          number = 2;
          break;
      case 'D':
      case 'E':
      case 'F':
          number = 3;
          break;
      case 'G':
      case 'H':
      case 'I':
          number = 4;
          break;
      case 'J':
      case 'K':
      case 'L':
          number = 5;
          break;
      case 'M':
      case 'N':
      case 'O':
          number = 6;
          break;
      case 'P':
      case 'Q':
      case 'R':
      case 'S':
          number = 7;
          break;
      case 'T':
      case 'U':
      case 'V':
          number = 8;
          break;
      case 'W':
      case 'X':
      case 'Y':
      case 'Z':
          number = 9;
      }
	
	
	
	System.out.println("The corresponding number is : " + number);
	
	}
}


