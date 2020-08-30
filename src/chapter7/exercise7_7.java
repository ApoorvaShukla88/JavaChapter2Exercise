package chapter7;

public class exercise7_7{
	public static void main(String[] args) {
		
		
		
	int[] a = randomGeneratedNumber();
				System.out.println(randomGeneratedNumber());
			for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
			System.out.println();
			
			int num = largestElement(a);
			System.out.println("Largest elemnt is : "+ num);
			
			int num1 = smallestElement(a);
			System.out.println("Smallest elemnt is : "+ num1);
		
		
	}
	
	public static int[] randomGeneratedNumber() {
		int[] myArray = new int[100];
		for(int i = 0; i< 100; i++) {
			myArray[i] = (int) (Math.random() * 100 + 10);
			System.out.print(myArray[i] + " ");
		}
		return myArray;
	}
	
	public static int largestElement(int[] array) {
		int largestNum = array[0];
		for(int i = 1; i < array.length; i++) {
			if(largestNum < array[i]) {
				largestNum = array[i];	
			}
		}
		return largestNum;
	}
	
	public static int smallestElement(int[] array) {
		int smallestNum = array[0];
		for(int i = 1; i < array.length; i++) {
			if(smallestNum > array[i]) {
				smallestNum = array[i];	
			}
		}
		return smallestNum;
		
	}
}