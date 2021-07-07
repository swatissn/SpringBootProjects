package com.kd.arrays;

public class FindLeftRotataionOfArray {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 7, 9 };
		int d = arr.length, lowestElement = arr[0], index = 0;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < lowestElement) {
				index = i;
				lowestElement = arr[i];
			}
		}
		
		System.out.println("Rotated count of array is "+(d-index)+" and first element is "+lowestElement);
	}
}
