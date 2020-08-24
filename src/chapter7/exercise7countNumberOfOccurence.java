package chapter7;

public class exercise7countNumberOfOccurence{
	public static void main(String[] args) {
		
		
		int[] myArray = new int[100]; 
		
		
		int[] counts = new int[10]; 
		
		
		for(int i = 0; i< myArray.length; i++) {
		counts[(int)( Math.random()* 10)]++;
		System.out.println();
		}
		
		
		for(int j = 0; j< counts.length; j++) {
			System.out.println("Number "+ j + " is " + counts[j] + " times");
//			System.out.print(counts[j] + " ");
		}
//				
//			}
		
		
	}	}	
		

