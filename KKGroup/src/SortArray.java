import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] arr = { 35, 23, 37, 7, 67, 32, 84 };
		int total = 0;
		System.out.println("Before Array Sorting : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

		Arrays.sort(arr);
		System.out.println("\nAfter Array Sorting : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		
		total = arr[0] + arr[arr.length - 1];
		System.out.println("sum is : " + total);
	}
}
