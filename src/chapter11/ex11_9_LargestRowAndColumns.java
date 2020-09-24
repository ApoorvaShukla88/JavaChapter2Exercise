package chapter11;
import java.util.Random;
import java.util.Scanner;

public class ex11_9_LargestRowAndColumns {
    public static void main(String[] args){
        System.out.println("Enter the array size n : ");
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        for(int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                Random random = new Random();
                matrix[row][col] = random.nextInt(2);
            }
        }
            //print
            for(int i = 0 ; i < matrix.length ; i++){
                 for(int j = 0 ; j < matrix[i].length; j++){
                     System.out.print(matrix[i][j] + " ");
                 }
                System.out.println();
            }
            // count the number of occurence of 1 in rows
        int[] row1count = new int[n];
        int[] col1count = new int[n];
        for(int row = 0; row < matrix.length; row++){
            for(int j = 0; j < matrix[row].length; j++){
                if(matrix[row][j] == 1){
                    row1count[row]++;
                    col1count[j]++;
                }
//                System.out.println("Row number : " + j + " count of 1 is "+ col1count[j]);
            }


        }

        int maxRow = row1count[0];
        int maxCol = col1count[0];
        //traverse through counter
        for(int i =1; i < n ; i++){
            if(maxRow < row1count[i]){
            maxRow = row1count[i];
            }
            if(maxCol < col1count[i]){
                maxCol = col1count[i];
            }

        }
        System.out.println("The largest row index :  " + maxRow);
        System.out.println("The largest col index :  " + maxRow + ", " + maxCol);

    }}






