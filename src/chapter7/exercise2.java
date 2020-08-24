package chapter7;

import java.util.Scanner;

public class exercise2{
	public static void main(String[] args) {

		int[] list1 = new int[10];

		int[] reversedList = reverse(list1);
		for (int i = 0; i < reversedList.length; i++) //for loop to print the array  
			System.out.print( reversedList[i]+ " ");  
		System.out.println();
	}
	public static int[] reverse(int[] list) {
		Scanner input = new Scanner(System.in);
		System.out.println("Original Array:");
		for(int i=0;i<list.length;i++) {
			list[i] = input.nextInt();
			//System.out.print(list[i] + "  ");
		}
		System.out.println();

		int [] reversed = new int[list.length];
		for(int i=list.length-1;i>=0 ; i--){

			reversed[(list.length-1)-i] = list[i];

		}

		return reversed;
	}
}
//		
	

	
