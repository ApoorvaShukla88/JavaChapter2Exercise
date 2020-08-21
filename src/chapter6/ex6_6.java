package chapter6;

public class ex6_6 {
	public static void main(String[] args) {
		displayPatterns(15);
		
	}
	
	public static void displayPatterns(int n) {
		for(int i = 1; i <= n; i++) {
		for(int j = n ; j >=1  ; j--) {
			if(i<j) {
				System.out.print(" ");
			}else {
				if(i>10 && j > 10) System.out.print("" + j);
				else System.out.print(j);
				
			}
					
			
//			System.out.print((i<j) ? " " : (j>10) ? " ": j-1);
		}
		System.out.println();
		
	}
//	System.out.println();
    } 
	
}

