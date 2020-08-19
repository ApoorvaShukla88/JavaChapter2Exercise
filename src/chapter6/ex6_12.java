package chapter6;

public class ex6_12 {
	public static void main(String[] args) {
		printChars('1', 'Z', 10);
	}
		public static void printChars(char ch1, char ch2, int numberPerLine)
		{
			int iCount = 0;
			for(char i = ch1; i <= ch2 ; i++) {
				System.out.print(i + " ");
				iCount++;
				if(iCount % numberPerLine == 0) {
					System.out.println();
				}
			}
		}
		
		
		
		
	}