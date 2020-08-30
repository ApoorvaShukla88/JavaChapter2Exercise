package chapter7;

public class exercise7_9{
	
	public static void main(String[] args) {
		
		double[] numbers = new double[10];
		for(int i = 0; i < numbers.length; i++) {
			 numbers[i] = Math.random() * 10;
			 
		}
		for(int j = 0; j < numbers.length; j++) {
		System.out.print(numbers[j] + " ");
		}
		System.out.println();
		
		double a = min(numbers);
		System.out.println("Smallest number is : " + a + " ");
		
		
	}
	
	public static double min(double[] array) {
	 double temp = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] < temp) {
				temp = array[i];
				
				
			}
		} return temp;
		
		
		
	}
	
	
}