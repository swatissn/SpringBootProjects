package com.kd.arrays;

public class ArraysDemo3 {
	public static void main(String[] args) {

		int[][] array = { { 1, 2, 3, 4 }, { 9, 7, 8 } };

		/*
		 * for (int[] arr : array){ System.out.println(); for (int a : arr)
		 * System.out.print(" " + a); }
		 */

		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {

				System.out.print(" " + array[i][j]);
			}
		}

	}

}
