/*
    Program Name: quiz2_2.java
    Author: Jose Antonio Lopez
    Date: 04/17/2022
    Program Description (brief): 
        This code will generate two seperate random-
    integer arrays with a length of the users choise 
    by input. The code will proceed to print both
    arrays, find which array has more even value 
    elements, and finally find which array has the 
    greatest value element and print them.
*/

package Week12;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class quiz2_2 {

    public static int[] constructArray(Scanner scnr){
        int length = scnr.nextInt();
        
        //Initalizing new array.
        int[] tempArray = new int [length];

        //Generates random array with values from 0-99.
        Random randNum = new Random();
        for(int i=0; i<length; ++i)
            tempArray[i] = randNum.nextInt(100);

        return tempArray;
    }

    public static void printArray(int[] tempArray){
        //Prints each elements in each array.
        for(int i=0; i<tempArray.length; ++i){
            System.out.print(tempArray[i] + " ");
        }
        System.out.println();

        /* I wanted to use this print method below but I wasn't sure if I should
           use it or the for loop method so I decided to use the for loop.
           Everything else in the code I wasn't confused on just this. :) */
        //System.out.println(Arrays.toString(tempArray));

    }

    public static int findMoreEvens(int[] n1, int[] n2){
        //Intializing and delcaring here.
        int n1evens, n2evens;
        n1evens = 0;
        n2evens = 0;
        
        //Finds how many even value elements are in array1.
        for (int i = 0; i < n1.length; ++i) {
            if (n1[i] % 2 == 0) 
                ++n1evens;
        }
        
        //Finds how many even value elements are in array2.
        for (int i = 0; i < n2.length; ++i) {
            if (n2[i] % 2 == 0) 
                ++n2evens;
        }
        
        //Finds which array has the most evens and returns only that array number.
        if(n1evens>n2evens){
            return 1;
        }

        else{
            return 2;
        }

    }

    public static int findGreatest(int[] n1, int[] n2){
        //Initalizing and delcaring here.
        int len1=n1.length;
        int len2=n2.length;
        int idxN1 = 0;
        int idxN2 = 0;
        int max1=n1[0];
        int max2=n2[0];

        //Finds and locates the max value element in array1.
        for(int i=0;i<len1;i++){
            if(n1[i]>max1){
                max1=n1[i];
                idxN1 = i;
            }

        }
    
        //Finds and locates the max value element in array2.
        for(int j=0;j<len2;j++){
            if(n2[j]>max2){
                max2=n2[j];
                idxN2 = j;
            }
        }

        /* Finds the greatest value element in both arrays, sets it as the last
           element in the array and returns only that array number. */
        if(max1>max2){
            n1[n1.length-1] = n1[idxN1];
            return 1;
        }

        else{
            n2[n2.length-1] = n2[idxN2];
            return 2;
        }

    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //Initalizing arrays.
        int[] array1, array2;

        //Generates the random arrays in another method.
        array1 = constructArray(scnr);
		array2 = constructArray(scnr);

        //The arrays are printed in the "printArray" method.
        printArray(array1);
		printArray(array2);

        //This finds the array with the most even elements in it.
        int result = findMoreEvens(array1, array2);
		System.out.println("The array " + result + " has move even numbers.");

        //Finds & prints the greatest element value with the array number when comparing both arrays.
        result = findGreatest(array1, array2);
		if (result == 1)
			System.out.println(
					"The array " + result + " has the greatest value " + array1[array1.length - 1] + ".");
		else
			System.out.println(
					"The array " + result + " has the greatest value " + array2[array2.length - 1] + ".");

        scnr.close();
    }
}
