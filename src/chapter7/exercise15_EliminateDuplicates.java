package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class exercise15_EliminateDuplicates{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] myArray = new int[10];
		 System.out.println(Arrays.toString(myArray));
		 System.out.println("Enter 10 Numbers : " );
		 for(int i = 0; i < myArray.length; i++) {
			 myArray[i] = input.nextInt();
		 }
		 System.out.println("My Array before sort :" + Arrays.toString(myArray));
		  Arrays.sort(myArray);
		  System.out.println("My Array after sort :" + Arrays.toString(myArray));
		  
		  Integer[] tempArray = eliminateDuplicates(myArray);
		  System.out.println("UNique Elemnt Array :" + Arrays.toString(tempArray));

	
}
public static Integer[] eliminateDuplicates(int[] origArray){
	Integer[] uniqueElementArray = new Integer[origArray.length];
    
    int j = 0;
    for (int i = 0; i < origArray.length - 1; i++) 
    {
        Integer currentElement = origArray[i];
         
        if (currentElement != origArray[i+1]) {
        	uniqueElementArray[j++] = currentElement;
        }
    }
     
    uniqueElementArray[j++] = origArray[origArray.length-1];
     
    return uniqueElementArray;

}  
}
// Output
//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
//Enter 10 Numbers : 
//1
//2
//3
//2
//2
//3
//6
//5
//1
//2
//My Array before sort :[1, 2, 3, 2, 2, 3, 6, 5, 1, 2]
//My Array after sort :[1, 1, 2, 2, 2, 2, 3, 3, 5, 6]
//UNique Elemnt Array :[1, 2, 3, 5, 6, null, null, null, null, null]			



	
	
