package Week9;
import java.util.Scanner;
import java.util.Arrays;

public class CrossCheck {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);


        int N = scnr.nextInt();
		int M = scnr.nextInt();
		int[][] numbers = new int[N][M];
		int cnt = 0;

		try {
			for (int i = 0; i < numbers.length; i++)
				for (int j = 0; j < numbers[i].length; j++)
					numbers[i][j] = scnr.nextInt();
		} catch (Exception e) {
			System.err.println("Input Error");
			e.printStackTrace();
		}
		 for (int i = 0; i < numbers.length; i++)
		 System.out.println(Arrays.toString(numbers[i]));


      // Your code 

      for(int i=1; i<numbers.length-1; ++i){
        for(int j=1; j<numbers[i].length-1; ++j){
            if(numbers[i][j]==1){
                if( (numbers[i-1][j]==1) && (numbers[i+1][j]==1) && (numbers[i][j-1]==1) && (numbers[i][j+1]==1) ){
                    ++cnt;
                }
            }
        }
      }
      


		System.out.println(cnt);
		scnr.close();
    }
}
