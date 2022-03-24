/*
    Program Name: quiz2.java
    Author: Jose Antonio Lopez
    Date: 03/24/2022
    Program Description (brief): 
        This code will intake the users row number index from
	matrix1 and multipy each element in the row with each
	element from both columns in matrix2 and out put the sum.
*/

package Week9;
import java.util.Arrays;
import java.util.Scanner;

public class quiz2 {
	public static void main(String[] args) {
    
        Scanner scnr = new Scanner(System.in);
		final int L = 3; // will NOT use L. Just for the extendability.
		final int M = 3;
		final int N = 2;
		int[][] matrix1 = { { 2, 5, 10 },
				            { 3, 6, 9 },
				            { 1, 2, 3 } };
		int[][] matrix2 = { { 10, 20 },
				            { 30, 40 },
				            { 50, 60 } };
		int rowidx = scnr.nextInt();

		// Your code
		int sum;
		int i,j;

		/*This nested for loop will multiply all the elements that are required
		  and outprint them when done.*/
		for(i=0; i<N; ++i){
			sum = 0;

			for(j=0; j<M; ++j)
				sum += matrix1[rowidx][j] * matrix2[j][i];

			System.out.print(sum + " ");
		}
		scnr.close();
    }
}