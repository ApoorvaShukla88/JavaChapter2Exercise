package chapter8;

import java.util.Arrays;

public class exercise8_16_sortTwoDimensionalArray{
	public static void main(String[] args) {
		
		int[][] a = {{4,2}, {1,7}, {4,5}, {1,2}, {1,1}, {4,1}};
//		Arrays.sort(a);
		
		sort(a);
		
		
		
		
		
	}
	
	public static void sort(int m[][]) {
		for(int i = 0; i < m.length; i++) {
			for(int j= 0; j < m[i].length; j++) {
				for(int k = 0; k < m[i].length-j-1; k++) {
					  if (m[i][k] > m[i][k + 1]) { 
						  
	                        // swapping of elements 
	                        int temp = m[i][k]; 
	                        m[i][k] = m[i][k + 1]; 
	                        m[i][k + 1] = temp;				
	                        }
			}
		}
		
	}
  for (int i = 0; i < m.length; i++) { 
    for (int j = 0; j < m[i].length; j++) 
        System.out.print("{" + m[i][j] + " , " + "}"); 
    System.out.println(); 
} }}