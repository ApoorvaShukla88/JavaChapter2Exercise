package chapter7;

import java.util.Scanner;

public class exercise2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		int[] list1 = new int[10];
		int[] list1 = {10,20,30,40,50,60,70,80,90, 100};
		int[] reversedList = reverse(list1);
		System.out.println(reversedList);
	}
		 public static int[] reverse(int[] array) {
//			 Scanner input = new Scanner(System.in);
//		    System.out.println("Original Array:");
//		    for(int i=0;i<array.length;i++) {
//		    	array[i] = input.nextInt();
//		         System.out.print(array[i] + "  ");
//		    }
//		    System.out.println();
//		     
//		    //print array starting from last element
//		    System.out.println("Original Array printed in reverse order:");
//		         for(int i=array.length-1;i>=0;i--) {
//		         System.out.print(array[i] + "  ");}
//		     System.out.println();    
//		    }
//		
		
			 
			 for(int i=0; i<array.length/2; i++){
				 int temp = array[i]; 
				 array[i] = array[array.length -i -1]; 
				 array[array.length -i -1] = temp;
			 }
			 System.out.println("array after reverse: " );
			 for (int k = 0; k < array.length; k++) { 
		            System.out.print(array[k] + " "); 
		        }
			return array; 

			 }
		}
	
