package chapter7;

public class selectionSortFindLargest{
	public static void main(String[] args) {
		
		
		int[] a = findLargest();
	
		
	}
	public static void findLargest(int[] list) {
		
		for(int i =0; i < list.length; i++) {
			int tempLargest = list[i];
			int tempLargestIndex = i;
			for(int j = i+1; j < list.length; j++) {
				if(tempLargest < list[j]) {
					tempLargest = list[j];
					tempLargestIndex = j;
				}
				
			}
			
	// Swap
			if( tempLargestIndex != i) {
				list[tempLargestIndex] = list[i];
				list[i] = tempLargest;
			}
		}
	}
	
}