import java.util.Scanner;

public class lab519 {
	public static void main(String[] args) {
		int length = 5;
		int[] numbers = { 5, 20, 30, 35, 50, 0, 0, 0, 0, 0 };
		int insert_value, idx;

		Scanner scnr = new Scanner(System.in);
		insert_value = scnr.nextInt();

		/*
		 * // Your Code here !
		 * // Find the location of where the insert_value should go
		 * for (idx = 0; idx < length; ++idx) {
		 * if(insert_value < numbers[idx]){
		 * //make space for the insert_value
		 * for(int i=0; i<(length-(idx)); ++i ){
		 * numbers[idx + i] = numbers[idx +1];
		 * }
		 * numbers[idx] = insert_value;
		 * break;
		 * }
		 * }
		 * 
		 */

		// new array
		int newNumbers[] = new int[length + 1];
		int flag = 0; // flag == 0 means not yet inserted

		for (idx = 0; idx < length; ++idx) { // idx = 2
			if (insert_value < numbers[idx]) { // 25 < 30

				for (int i = 0; i < length + 1; ++i) { // i = 0
					// System.out.println(idx);
					if (i < idx) { // i = 0 idx = 0
						newNumbers[i] = numbers[i];
					}

					else if (i == idx) {
						newNumbers[i] = insert_value; // newNumbers[0]
						flag = 1;
					}

					else { // i > idx , i = 3, [idx + i] = 2 +
						newNumbers[i] = numbers[i - 1];
					}

				}
				break;
			}
		}
		if (flag == 0) {
			// insert new value at the last index.
		}

		for (int i = 0; i < length + 1; i++) {
			System.out.print(newNumbers[i] + " ");
		}
		System.out.println();
		scnr.close();
	}

}
