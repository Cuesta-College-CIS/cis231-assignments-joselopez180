package Week9;
import java.util.Scanner;
import java.util.Arrays;

public class TestingCode {
    public static void main( String args[] ) {
        int[] numbers = { 4, 7, 3, 0 };
        int i;

        for(i=0; i<4; ++i){
            numbers[i] = numbers[i+1];
        }

        System.out.print(Arrays.toString(numbers));




    }
}
