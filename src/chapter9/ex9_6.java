package chapter9;

import java.util.Date;
import java.util.Random;

public class ex9_6{
	public static void main(String[] args) {
		Stopwatch s = new Stopwatch();
		
		int[] myArray = new int[10]; 
		Random r = new Random(10);
	
	        for(int i = 0; i< myArray.length; i++) 
	        { 
	           myArray[i] = r.nextInt(10);
	        }
	        
	        // displaying the array
	        for(int i = 0; i < myArray.length; i++) {
	        	System.out.print(myArray[i] + " ");
	        }
	       
	        
	s.start();
	int[] b = selectionSort(myArray);
	System.out.println(b);
	for(int i = 0; i < b.length; i++) {
    	System.out.print(b[i] + " ");
    }
	s.stop();
	System.out.println("Time elapsed : " + s.getElapsedTime() + " millisecond ");

	}
	
	public static int[] selectionSort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			int currentMin = array[i];
			int currentMinIndex = i;
			for(int j = i+1; j < array.length; j++ ) {
				if(currentMin > array[j]) {
					currentMin = array[j];
					currentMinIndex = j;
					
				}
			}
			if(currentMinIndex != i) {
				array[currentMinIndex] = array[i];
				array[i] = currentMin;
			}
		}
		
		return array;
		
	}
	
	
}

class Stopwatch {
	
	private static long startTime;
	private static long endTime;
	private static long currentTime;
	Stopwatch() {
		Stopwatch.startTime = System.currentTimeMillis();
//		Stopwatch.currentTime = System.currentTimeMillis();
	}
	
	
	public long getStartTime() {
		return Stopwatch.startTime;
	}
	public long getEndTime() {
		return Stopwatch.endTime;
	}
	public void setStartTime(long startTime) {
		Stopwatch.startTime =startTime;
	}
	public void setEndTime(long endTime) {
		Stopwatch.endTime =endTime;
	}
	
	public void start() {
		Stopwatch.startTime = System.currentTimeMillis();
		
	}
	public void stop() {
		Stopwatch.endTime = System.currentTimeMillis();
		
	}
	
	public long getElapsedTime() {
		return endTime - startTime;
	}
	
	
	
	
}