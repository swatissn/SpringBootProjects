package com.kd.arrays;


import java.util.Arrays;

public class RotatedCountOfSortedRotatedArray {
	public static void main(String[] args) {
		int[] arrays = { 12,15, 18, 2, 3, 6};
		
		findingFirstElement(arrays);
		System.out.println("\n\n");
		sortingArraysAndFindRotation(arrays);
	}
	private static void findingFirstElement(int[] arrays) {
		int index = 0,lowestElement=arrays[0];
		
		for (int i = 1; i < arrays.length; i++) {			
			if(lowestElement > arrays[i]){
				index = i;
				lowestElement =arrays[i];
			}
				
		}
		
		System.out.println("Given array is rotated "+index+" times \nAnd first element of array is "+lowestElement);
	}
//one way to find rotation
	private static void sortingArraysAndFindRotation(int[] arrays) {
		int[] sortedArray = Arrays.copyOf(arrays, arrays.length);
		int temp;
		for (int i = 0; i < arrays.length-1; i++) {
			int j;
			for (j = 0; j < arrays.length-1; j++) {

				if(sortedArray[j] > sortedArray[j+1]){
					temp = sortedArray[j];
					sortedArray[j] = sortedArray[j+1];
					sortedArray[j+1] = temp;
				}
			}
		}
		
		exit:for (int j = 0; j < arrays.length-1; j++) {
			if(sortedArray[0] == arrays[j]){
				System.out.println("Given array is rotated "+j+" times");
				break exit;
			}
			
		}
		
		
		
		System.out.println(Arrays.toString(sortedArray));
	}
}
