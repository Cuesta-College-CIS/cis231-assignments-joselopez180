package Week9;
import java.util.Arrays;
import java.util.Scanner;

public class quiz1 {
	public static void main(String[] args) {
		final int CNT = 5;
		int minval, minidx, tmp;

		Scanner scnr = new Scanner(System.in);
		int N = scnr.nextInt();
		int[] numbers = new int[N];
		for (int i = 0; i < N; i++)
			numbers[i] = scnr.nextInt();

		// Your code
        minidx=0;
        minval=numbers[0];
        int i,j=0;
        //this will find the idx location of the smallest #
        for(i=0; i<CNT; ++i ){
            
            for( j=i+1; j<N; ++j){
                if(numbers[j]<minval){
                    minval=numbers[j];
                    minidx=j;
                }
            }

            //this swaps the elements
            tmp = numbers[i];
            numbers[i]=numbers[minidx];
            numbers[minidx]=tmp;

            



            //outprint the array
            System.out.println(Arrays.toString(numbers));
        }




		scnr.close();
	}
}