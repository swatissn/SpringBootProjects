package ArrayProgram;
import java.util.Arrays;

public class sortedArrayDemo1
{
	public static void main(String[] args) 
	{
		int[] a={24,21,20,6,7,4,3};
		int total=0,length=7;
		System.out.println("before sorting:");
//		for(int i=0;i<length;i++)
//		{
//			System.out.print(a[i]+ ",");
//		}
		for(int a1:a)
		{
			System.out.print(a1+ ",");
			
		}
		Arrays.sort(a);
		System.out.print("\nafter sorting:");
		for(int a1:a)
		{
			System.out.print(a1+ ",");
		}
		total=a[0]+a[a.length-1];
		
		System.out.println("\naddition is:"+total);
		
	}

}
