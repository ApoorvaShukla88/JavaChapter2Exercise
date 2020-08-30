package chapter7;

public class reverseAnArray{
	public static void main(String[] args) {
		int[] a = randomGeneratedNumber();
		System.out.println();
		System.out.println("Before");
		for(int i = 0 ; i < a.length ; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("After");
		for(int i = a.length-1 ; i > 0 ; i--) {
			System.out.print(a[i] + " ");
		}
	}
	

	public static int[] randomGeneratedNumber() {
		int[] myArray = new int[10];
		for(int i = 0; i < 10; i++) {
			myArray[i] = (int) (Math.random() * 10);
			System.out.print(myArray[i] + " ");
		}
		return myArray;
	}
	}