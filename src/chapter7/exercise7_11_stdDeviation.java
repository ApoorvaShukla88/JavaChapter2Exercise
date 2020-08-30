package chapter7;

public class exercise7_11_stdDeviation{
	public static void main(String[] args) {
		
		double[] a = randomGeneratedNumber();
		double dev = deviation(a);
		System.out.println();
		System.out.print("Deviation is : " + dev + " ");
		
		
	}
	
	public static double[] randomGeneratedNumber() {
		double[] myArray = new double[100];
		for(int i = 0; i< 100; i++) {
			myArray[i] = (int) (Math.random() * 100 + 10);
			System.out.print(myArray[i] + " ");
		}
		return myArray;
	}
	
	public static double mean(double[] x) {
		int sum  = 0;
		int avg = 0;
		for( double element : x) {
			sum += element;
			
		}
		avg = sum / x.length;
		return avg;
	}
	


public static double deviation(double[] x) {
	
	double dev = 0;
	double mean = mean(x);
	
	for(int i = 0; i < x.length; i++) {
		dev += Math.pow(x[i] - mean, 2);
	}
	
	dev = Math.sqrt(dev/ x.length);
	return dev;
	
	
}}