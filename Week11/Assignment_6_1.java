/*
    Program Name: SwappingVariables.java
    Author: Jose Antonio Lopez
    Date: 04/06/2022
    Program Description (brief): 
        This code will intake the users 4 integers and
    store it in an array. Then, by using another user 
    method, it will resort the elements. Finally the
    main method will output the new array.
*/

package Week11;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment_6_1 {

    public static void swapValues(int[] values){
        //declaring variabels
        int tempNum = 0;

        //Swaping elements of values array
        tempNum = values[0];
        values[0] = values[1];
        values[1] = tempNum;

        tempNum = values[2];
        values[2] = values[3];
        values[3] = tempNum; 
    }
    
	public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //declaring variables
        int N = 4;
        int[] values = new int[N];

        //assigning user inputs into the array
        for (int i = 0; i < N; i++)
			values[i] = scnr.nextInt();

        //send array to sorting method
        swapValues(values);

        //outprint new sort array
        for (int i = 0; i < N; i++){
			System.out.print(values[i]);
			
			if(i==3){
			   continue;
			}

            System.out.print(" ");
            
        }

        System.out.println();

        scnr.close();
    }

}