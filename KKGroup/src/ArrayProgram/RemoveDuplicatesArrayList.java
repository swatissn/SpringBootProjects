package ArrayProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesArrayList
{
	public static void main(String[] args) 
	{
		Integer[] array={1,12,78,2,2,3,3,4,8,6,5,6,10};
		
		List<Integer> list= Arrays.asList(array);
		
		System.out.println("arraylist Elements:"+list);
	
		Set<Integer> set =new LinkedHashSet<Integer>(list);
		
		//set.addAll(list);
		
		System.out.println("remove duplicates:"+set);
		
		
		
	}

}
