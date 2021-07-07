package ArrayProgram;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
//import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CountDuplicateElementArraylist 
{
	public static void main(String[] args) 
	{
		Integer[] a={1,2,3,4,5,1,2,3};
		List<Integer> list = Arrays.asList(a);
		   
      Map<Integer, Integer> map=new LinkedHashMap<Integer,Integer>();
   
      for(int i=0;i<list.size();i++)
      {
	   int key= list.get(i);
	   if(map.containsKey(key))
	   {
		   int value=map.get(key);
		   map.put(key,value+1);
		   
	   }
	   else
	   {
		   map.put(key, 1);
	   }
	   
      }
   System.out.println(map);
   System.out.println("duplicate value is:");
   map.forEach((k,v)->
   {    
            if(v>1)
            {
            	
            	System.out.println(k+ ": "+v);
            }
		
   
   });
	
	}

}
