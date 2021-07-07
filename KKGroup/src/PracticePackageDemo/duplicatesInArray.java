package PracticePackageDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicatesInArray 
{
	public static void main(String[] args) {
		
		int temp;
		Integer[] a={2,1,1,2,3,3,4,5,6};
		
		/*System.out.println("duplicates in array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+ " ");
				}
			}	
         }*/
		List<Integer> list=Arrays.asList(a);
		System.out.println("duplicates in arraylist:");
		for(int i=0; i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)==list.get(j))
				{
					System.out.print(list.get(j)+ " ");
				}
			}
		}
		
	}
}
	



