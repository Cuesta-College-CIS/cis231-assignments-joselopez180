/*
    Program Name: GreatestSum.java
    Author: Jose Antonio Lopez
    Date: 05/17/2022
    Program Description (brief): 
        This code will intake any user integer 
    input and out put an array thats number of 
    elements are equal that to the users input.  
    The elements themselves will be randomly 
    generated integers from (0-99). Then, the 
    code will out-print this random array list
    and finally out-print the greatest sum of 
    three consecutive numbers from the 
    array-list.
*/


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class GreatestSum {

    /* This will prompt the user to input the nth number
       of random integers.                               */
       static Integer userInput(){
        Scanner scnr = new Scanner(System.in);
        
            int userInput = 0;

            System.out.println("Enter nth number of elements: ");
            userInput = scnr.nextInt();

            return userInput;
    
    }

    /* This will generate the nth length array list with
       random values from (0-99). */
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

    //This method will find the greatest sum of only 3 numbers from the array.
    static ArrayList<Integer> greatestSum(ArrayList<Integer> thisrandomArray,int thisUserInput){
        ArrayList<Integer> finalArray = new ArrayList<Integer>();
        int tempIdx = 0;
        int finalSum = 0;
        int tempSum = 0;
        int consecNum = 3;

        for (int i = 0; i<(thisrandomArray.size() - 2); ++i) {
            finalSum = 0;

            for(int j=0; j<consecNum; ++j)
            finalSum += thisrandomArray.get(j+i);

            if (finalSum > tempSum){
                tempIdx = i;
                tempSum = finalSum;
            }
        }  

        //Make the new array list with the greatest consecutive sum.
        for(int i=0; i<consecNum; ++i){
            finalArray.add(thisrandomArray.get(tempIdx+i));
        }

        System.out.println();
        System.out.println();
        System.out.println("The greatest sum from 3 integers: ");

        //out print the elements of the greatest consecutive sum.
        for(int i=0; i<finalArray.size(); ++i){
            System.out.print(finalArray.get(i) + " ");
        }
     
        System.out.println();

        return thisrandomArray;
    }

    public static void main(String[] args) {
        int thisuserInput = 0;

        thisuserInput = userInput();

        ArrayList<Integer> thisrandomArray = new ArrayList<Integer>();
        thisrandomArray = generatorList(thisuserInput);

        greatestSum(thisrandomArray, thisuserInput);
    }
}
