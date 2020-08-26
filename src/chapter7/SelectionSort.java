package chapter7;

import java.util.Arrays;

public class SelectionSort{
	public static void main(String[] args) {
		
		double[] a = {1, 2,3,11,22, 99,43, 6};
		double[] b = selectionSortA(a);	
		System.out.println(Arrays.toString(b));
		
	}
	
	public static double[] selectionSortA(double[] list) {
		for(int i = 0 ; i< list.length; i++) {
			double currentMin = list[i];
			int currentIndex = i;
			for(int j = i+1 ; j< list.length; j++) {
				if (currentMin < list[j]) {
					currentMin = list[j];
					currentIndex = j;
				}
			}
			
			// update list[i]
			if(currentIndex != i) {
				list[currentIndex] = list[i];
				list[i] = currentIndex;
			}
			
			
		}
//		System.out.println(list);
		return list;
	}
}