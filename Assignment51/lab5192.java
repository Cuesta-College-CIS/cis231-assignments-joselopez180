import java.util.Scanner;

public class lab5192 {
	public static void main(String[] args) {
		int length = 5;
		int[] numbers = { 5, 20, 30, 35, 50, 0, 0, 0, 0, 0 };
		int insert_value, idx;

		Scanner scnr = new Scanner(System.in);
		insert_value = scnr.nextInt(); // 25, 0, 55

		for (idx = 0; idx < length; ++idx) {
			if (insert_value < numbers[idx]) { // 25 < 30
				break;
			}
		}

		// idx = 2

		// for(int i=length-1; i >= idx; i--)
		// shift right from idx to length-1

		numbers[5] = insert_value;
		length += 1;
		scnr.close();
	}

}
