package ArrayProgram;

import java.util.Arrays;
import java.util.List;

public class finddublicateselementArray 
{
	public static void main(String[] args) 
	{
		Integer[] array={1,2,2,1,3,3,4,5,6};
		
		/*System.out.println("duplicates element in array:");
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					 System.out.print(array[i]+ " ");
				}
			}
		}*/
		
		List<Integer> list=Arrays.asList(array);
		
		System.out.println("duplicate element in arraylist:");
		for(int i=0;i<list.size();i++)
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
