package chapter7;

import java.util.Scanner;

public class ex7_27IdenticalArrays{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		System.out.println("Enter the List1 : ");
		
		
		int[]  myList1 = new int[5];
		int[] myList2 = new int[5];
		System.out.println("Enter list1");
		for(int i = 0; i < myList1.length; i++) {
			
			myList1[i] = input.nextInt();	
		}
		System.out.println("Enter list2");
		for(int i = 0; i < myList2.length; i++) {
			
			myList2[i] = input.nextInt();	
		}
		
		
		boolean a = equals(myList1, myList2);
		System.out.println(a);
		
		
		
	}
	
	public static boolean equals(int[] list1, int[] list2) {
		boolean flag = true;
		if(list1.length != list2.length) {
			flag = false;
		}else {
			for(int i = 0; i < list1.length; i++) {
				if(list1[i] != list2[i]) {
					flag = false;
				}
			}
		}
		
		return flag;
	} 
}