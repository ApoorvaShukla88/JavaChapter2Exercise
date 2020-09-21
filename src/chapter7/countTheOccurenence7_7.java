package chapter7;

public class countTheOccurenence7_7{
	public static void main(String[] args) {
		int[] a = randomGeneratedNumber();
		
		int b = countOccurence(a);
		System.out.println();
		System.out.println("Occurence are : "+ b);
//		for(int i = 0; i < b.length; i++) {
//			System.out.print(b[i] + " ");
//		}
		
		
		
		
		
	}
	public static int[] randomGeneratedNumber() {
		int[] myArray = new int[100];
		for(int i = 0; i< 100; i++) {
			myArray[i] = (int) (Math.random() * 10);
			System.out.print(myArray[i] + " ");
		}
		return myArray;
	}
	
	public static int countOccurence(int[] array) {
//		int[] count = new int[10];
		int counter = 1;
		for(int i = 0; i < array.length; i++) {

			for(int j = i+1; j < array.length; j++) {
				if(array[i] == array[j]) {
					counter++;	
				}
			}
			
			
			return counter;		
			}
		return counter;
		
		}


		
	}
	

