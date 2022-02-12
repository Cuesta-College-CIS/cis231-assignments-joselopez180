/*
    Program Name: AscendingNumbers.java
    Author: Jose Antonio Lopez
    Date: 02/11/2022
    Program Description (brief): 
        In this code the objective is to generate three
    random number and inform the user of thoes numbers.
    Then the code will organize the random number in
    ascending order from smallest to largest and inform
    the user of the new order.
*/

import java.util.Random;

public class AscendingNumbers {

    public static void main( String args[] ) {
        //instance of random class
        Random rand = new Random();
        
        //generate random values from 0-100.
        int num1 = rand.nextInt(101); 
        int num2 = rand.nextInt(101);
        int num3 = rand.nextInt(101);

        //Informing the user of the three random numbers.
        System.out.println("Random numbers are: " + num1 + " " + num2 + " " + num3);

        // If num1 is smallest out put starting there.
        if( !(num1 > num2) && !(num1 > num3) ){
            System.out.print("Sorted order: " + num1);
            
            if(num2 < num3){
                System.out.print(" " + num2);
                System.out.print(" " + num3);
            }

            else {
                System.out.print(" " + num3);
                System.out.print(" " + num2);
            }
        }


        // If num2 is smallest out put starting there.
        else if( !(num2 > num1) && !(num2 > num3) ){
            System.out.print("Sorted order: " + num2);

            if(num1 < num3){
                System.out.print(" " + num1);
                System.out.print(" " + num3);
            }

            else {
                System.out.print(" " + num3);
                System.out.print(" " + num1);
            }
        }


        // Else num3 is smallest out put starting there.
        else {
            System.out.print("Sorted order: " + num3);

            if(num1 < num2){
                System.out.print(" " + num1);

                System.out.print(" " + num2);
            }

            else {
                System.out.print(" " + num2);

                System.out.print(" " + num1);
            }
        }


        // END OF CODE


      }   
}