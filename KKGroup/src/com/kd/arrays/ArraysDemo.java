package com.kd.arrays;

public class ArraysDemo {
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };

		int shiftTimes = 2;

		for (int i = 0; i < shiftTimes; i++) {

			int temp = array[0];
			int j;
			for (j = 0; j < array.length-1; j++) {

				array[j] =array[j+1];
			}
			
			array[j] = temp;
		}
		for (int i : array){
			System.out.print(i+", ");
		}
		
	}
}
