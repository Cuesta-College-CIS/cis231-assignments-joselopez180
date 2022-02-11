import java.util.Random;

public class GreatestNumber {

    public static void main( String args[] ) {
        Random rand = new Random(); //instance of random class
        

        //generate random values from 0-100
        int num1 = rand.nextInt(101); 
        int num2 = rand.nextInt(101);
        int num3 = rand.nextInt(101);

        System.out.println("Random numbers are: " + num1 + " " + num2 + " "+ num3);

        if( (num1 > num2) && (num1 > num3) ){
            System.out.println("The greatest number is: " + num1);
        }

        else if( (num2 > num1) && (num2 > num3) ){
            System.out.println("The greatest number is: " + num2);
        }

        else{
            System.out.println("The greatest number is: " + num3);
        }




      }   
}
