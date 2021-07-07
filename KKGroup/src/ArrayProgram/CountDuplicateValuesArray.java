package ArrayProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDuplicateValuesArray
{
	public static void main(String[] args) 
	{
		Integer[] a={1,2,3,4,5,4,3,1};
		
		//List<Integer> list=Arrays.asList(a);
		
		//System.out.println(list);
		
	Map<Integer,Integer> freqCount=new HashMap<Integer,Integer>();

	
	for(int i=0;i<a.length;i++)
	{
		int key =a[i];
		if(freqCount.containsKey(key))
		{
			int value = freqCount.get(key);
			freqCount.put(key, value+1);
		}
		else
		{
			freqCount.put(key, 1);
		}
		
	}
	System.out.println(freqCount);
	System.out.println("duplicates element in array");
		freqCount.forEach((k,v)->
		                  {
		                	  if(v>1)
		                		  System.out.println(k+ " :" +v);
		                  });

	}
	

}
