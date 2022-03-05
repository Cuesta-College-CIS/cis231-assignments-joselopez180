import java.util.Scanner;

public class lab424 {
	public static void main(String[] args) {

		/* Type your code here. */
		Scanner scnr = new Scanner(System.in);

		int sum = 0;
		int cnt = -1;
		int num = scnr.nextInt();

		if (num > 100) {
			System.out.printf("%d\t%d\n", sum, cnt + 1);
		}

		else {

			// while(sum < 100){
			// sum += num;
			// ++cnt;

			// if(sum > 100){
			// continue;
			// }

			// else{
			// num = scnr.nextInt();
			// }

			// }
			while (sum < 100) {
				sum += num;
				++cnt;
				if (sum > 100)
					break;
				num = scnr.nextInt();
			}
			sum -= num;

			// Use the below line to print the result. sum = the summation, cnt = the number
			// of inputs used in sum
			System.out.printf("%d\t%d\n", sum, cnt);
		}
		scnr.close();
	}
}
