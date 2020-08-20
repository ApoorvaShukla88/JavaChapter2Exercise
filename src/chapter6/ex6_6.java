package chapter6;

public class ex6_6 {
	public static void main(String[] args) {
		display(6);
		
	}
	
	public static void display(int n) {
		for(int i = 1; i <= n ; i++) {
			for(int j = n; j >= 1; j--) {
				System.out.print((i<j) ? " " : j);
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
}