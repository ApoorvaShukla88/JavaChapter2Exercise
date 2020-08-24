package chapter6;

public class ex6_6 {
	public static void main(String[] args) {
		
		displayPatterns(100);
		
	}
	
	public static void displayPatterns(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j=n ; j >=1  ; j--) {
				if(i<j) 
					System.out.print("   ");
				
				  else {System.out.printf("%3d",j);}
			}
			System.out.println();
////				System.out.print("" + j);
////				System.out.print(j);
//				
		}}}	
		
		
		
		
		
		
		


