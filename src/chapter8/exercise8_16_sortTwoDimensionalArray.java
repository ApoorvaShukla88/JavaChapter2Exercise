package chapter8;

import java.util.Arrays;

public class exercise8_16_sortTwoDimensionalArray{
	public static void main(String[] args) {
		
		int[][] a = {{4,2}, {1,7}, {4,5}, {1,2}, {1,1}, {4,1}};
//		Arrays.sort(a);
		
//		sort(a);

	}
	
//	public static int sort(int m[][]) {
//		for (int i = 0; i < m.length; i++) 
//            Arrays.sort(m[i]); 
//		
//  
//        // printing the sorted matrix 
//        for (int i = 0; i < m.length; i++) { 
//            for (int j = 0; j < m[i].length; j++) 
//                System.out.print(m[i][j] + " "); 
//            System.out.println(); 
//        } 
//        
//        for (int i = 0; i < m.length; i++) { 
//            for (int j = m[i].length; j > 0; j--) 
//                System.out.print(m[i][j] + " "); 
//            System.out.println(); 
//        } 
//        
//        
//  
//        return 0; 
//        } }
	
//	int[][] my2DArray = Math.random()
	int index = 0;
	int[] flattenedAarray = new int[row*col];
	for(int i = 0; i < row; i++ )
	{
		for(int j = 0; j < col; j++) {
			flattenedAarray[index] = my2DArray[i][j];
			index++;
		}
	}

  
    