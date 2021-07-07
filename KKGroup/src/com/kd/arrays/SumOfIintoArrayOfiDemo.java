package com.kd.arrays;


public class SumOfIintoArrayOfiDemo {

	static int count = 0;
	static int maxSum = 0;

	public static void main(String[] args) {

		int[] array = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int maxRotation = array.length - 1;

		for (int i : array) {
			maxSum = maxSum + (count * i);
			count++;
		}

		System.out.println("intial sum of arrayof i into i is " + maxSum);
		count = 0;

		for (int i = 0; i < maxRotation; i++) {
			rotateToleft(array, i);
		}
		System.out.println("maximum sum of arrayof i into i is " + maxSum);
	}

	private static void rotateToleft(int[] array, int i) {
		int temp = array[0];
		int tempSum = 0;
		int j;
		count++;
		for (j = 0; j < array.length - 1; j++) {
			array[j] = array[j + 1];
			tempSum = tempSum + (j * array[j]);
		}
		array[j] = temp;
		tempSum = tempSum + (j * array[j]);

		if (tempSum > maxSum)
			maxSum = tempSum;
		System.out.println("sum of arrayof i into i with Rotation " + count + " is " + tempSum);

	}
}
