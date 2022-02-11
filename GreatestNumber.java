/*
    Program Name: GreatestNumber.java
    Author: Jose Antonio Lopez
    Date: 02/11/2022
    Program Description (brief): 
        In this code the objective is to generate three random 
    numbers from 0-100 and inform the user what thoes numbers 
    are. From there, the code will identify what number is 
    greatest out of the three random numbers and inform the user 
    what it is.
*/

import java.util.Random;

public class GreatestNumber {

    public static void main( String args[] ) {
        //instance of random class
        Random rand = new Random();
        

        //generate random values from 0-100.
        int num1 = rand.nextInt(101); 
        int num2 = rand.nextInt(101);
        int num3 = rand.nextInt(101);

        //Informing the user of the three random numbers.
        System.out.println("Random numbers are: " + num1 + " " + num2 + " "+ num3);

        //If num1 is greater then out it.
        if( (num1 > num2) && (num1 > num3) ){
            System.out.println("The greatest number is: " + num1);
        }
        //If num2 is greater then out it.
        else if( (num2 > num1) && (num2 > num3) ){
            System.out.println("The greatest number is: " + num2);
        }
        //If num3 is greater then out it.
        else{
            System.out.println("The greatest number is: " + num3);
        }

        // END OF CODE

      }   
}
