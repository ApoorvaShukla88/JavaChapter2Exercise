package chapter6;

public class ex6point1 {
	public static void main(String[] args) {
		int i;
		for(i = 1; i <=100; i++) {
				
//			System.out.print(getGetPentagonalNumber(i) + ", ");
			System.out.print(String.format("%7d", getGetPentagonalNumber(i)));
			if(i % 10 == 0) System.out.println();
			
		
		}
	}
		
		public static int getGetPentagonalNumber(int n) {
			
			int numberOfSides = (int) (n * ((3.0*n)-1) / 2);
			return numberOfSides;
			
			
		}
		
		
		
	}
	
