import java.util.Scanner;

public class Assignment_15.4 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int N1 = scnr.nextInt();
		int[] num1 = new int[N1];
		for (int i = 0; i < N1; i++)
			num1[i] = scnr.nextInt();

		int N2 = scnr.nextInt();
		int[] num2 = new int[N2];
		for (int i = 0; i < N2; i++)
			num2[i] = scnr.nextInt();

      // your code here !!


		for (int v : result)
			System.out.print(v + " ");
		System.out.println();
		scnr.close();
	}

}