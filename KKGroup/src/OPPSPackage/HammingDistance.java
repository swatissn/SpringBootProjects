package OPPSPackage;


import java.util.Arrays;

public class HammingDistance {
	static int[] inputArray;

	public static void main(String[] args) {
		inputArray = new int[] { 1, 2, 3, 4, 5 };
		query(new int[] { 1, 3 });
		query(new int[] { 3, 0, 2 });
		query(new int[] { 2, 1 });
		query(new int[] { 3, 1, 4 });

	}

	static void query(int[] array) {

		if (array != null && array.length == 2 && array[0] == 1) {
			// query 1

			rotateToRight(array[1]);

		} else if (array != null && array.length == 2 && array[0] == 2) {

			rotateToleft(array[1]);

		} else if (array != null && array.length == 3 && array[0] == 3) {

			int sum = 0;

			for (int i = array[1]; i < array[2]; i++) {

				sum += inputArray[i];

			}

			System.out.println(sum);

		} else
			System.out.println("NO query for this input");
	}

	private static void rotateToleft(int i) {
		int temp;
		int j;

		for (int j2 = 0; j2 < i; j2++) {
			temp = inputArray[0];
			for (j = 1; j < inputArray.length - 1; j++) {
				inputArray[j] = inputArray[j + 1];
			}
			inputArray[j] = temp;
		}

		System.out.println(Arrays.toString(inputArray));
	}

	private static void rotateToRight(int i) {
		int length = inputArray.length;
		int temp;
		int j2;

		for (int j = 0; j < i; j++) {
			temp = inputArray[length - 1];
			for (j2 = length - 2; j2 > 0; j2--) {
				inputArray[j2] = inputArray[j2 - 1];
			}
			inputArray[j2] = temp;
		}
		System.out.println(Arrays.toString(inputArray));
	}
}
