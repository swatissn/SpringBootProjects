import java.util.Arrays;
import java.util.Collections;

public class sortarraydemo 

{
	public static void main(String[] args)
	{
		int[] a={20,30,10,5,3};
		int total;	
		
		System.out.println("Before Sorting : ");
		for(int a1:a)
		{
			System.out.print(a1+",");
		}
		Arrays.sort(a);
		
		System.out.println("After Sorting : ");
		for(int a1:a)
		{
			System.out.print(a1+",");
		}
		total=a[0]+a[a.length-1];
		System.out.println("\nAddition is :"+total);
		
	}

}
