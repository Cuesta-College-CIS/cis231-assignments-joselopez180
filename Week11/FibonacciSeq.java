/*
    Program Name: FibonacciSeq.java
    Author: Jose Antonio Lopez
    Date: 04/07/2022
    Program Description (brief): 
        This code will intake an integer from the
     user. This input will find the nth value
     in the Fibonaccie sequence.
*/

package Week11;
import java.util.Scanner;
import java.util.Arrays;

public class FibonacciSeq {
   
   public static int fibonacci(int n) {
     /* Type your code here. */    
     //Declaring values here.
     int numOne, numTwo, sum;
     numOne = sum = 0;
     numTwo = 1;

     /* if iput is any negative number then
     output is -1. */
     if(n < 0){
        return (-1);
     }

     /* for loop that finds the nth value in
     Fibonacci's Sequence. */
        for(int i=0; i<n-1; ++i ){
            sum = numOne + numTwo;
            numOne = numTwo;
            numTwo = sum;
        }

        //Returns requested value to main method.
        return (sum);
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));

      scnr.close();
   }

}