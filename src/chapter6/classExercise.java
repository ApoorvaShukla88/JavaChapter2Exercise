package chapter6;

public class classExercise {
	public static void main(String[] args) {

		int a = add(5,4);
		int b = sub(5,4);

		System.out.println("Add Result : " + a);
		System.out.println("Subtract REsult : " + b);

	}

	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;

	}
	public static int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;




	}


}