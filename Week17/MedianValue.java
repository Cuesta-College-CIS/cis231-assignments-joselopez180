/*
    Program Name: MedianValue.java
    Author: Jose Antonio Lopez
    Date: 05/17/2022
    Program Description (brief): 
        This code will intake the user odd integer 
    input and out put an array thats number of 
    elements are equal that to the users input.  
    The elements themselves will be randomly 
    generated integers from (0-99). Then, the code 
    will out-print this random array list and 
    finally out-print the median value from that 
    list in ascedning order.
*/


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.*;


public class MedianValue {
    
    /* This will prompt the user to input the nth number
       of random integers.                               */
       static Integer userInput(){
        Scanner scnr = new Scanner(System.in);

        int tempHolder = 0;
        int userInput = 0;

        while(tempHolder == 0){

            System.out.println("~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Enter an odd value: ");
            userInput = scnr.nextInt();

            if((userInput % 2) != 0){
                break;
            }

            System.out.println("Error, not an odd  number.");
        }

        return (userInput);
    }

    /* This will generate the nth length array list with
       random values from (0-99).                        */
    static ArrayList<Integer> generatorList(int thisUserInput){

        ArrayList<Integer> randomArray = new ArrayList<Integer>();
        Random rand = new Random();

        for(int i=0; i<thisUserInput; i++)
                 randomArray.add(rand.nextInt(100));
                
        
        System.out.println();    
        System.out.println("Random Array: ");
        for (int element: randomArray)
            System.out.print(element + " ");

        return randomArray;
    }

    /* This will sort the array list in order from low
       to high and out print the median code.            */
    static ArrayList<Integer> sortList(ArrayList<Integer> thisrandomArray, int thisuserInput){
        Collections.sort(thisrandomArray);
        int tempIdx = (thisuserInput/2);

        System.out.println();
        System.out.println(thisrandomArray.get(tempIdx));

        return thisrandomArray;
    }

    public static void main(String[] args) {
        int thisuserInput = 0;

        thisuserInput = userInput();

        ArrayList<Integer> thisrandomArray = new ArrayList<Integer>();
        thisrandomArray = generatorList(thisuserInput);

        sortList(thisrandomArray, thisuserInput);
    }
}
