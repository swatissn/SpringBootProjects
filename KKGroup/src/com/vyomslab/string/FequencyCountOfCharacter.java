package com.vyomslab.string;

//import java.util;
import java.util.HashMap;
import java.util.Map;

import org.omg.CORBA.FREE_MEM;

public class FequencyCountOfCharacter 
{
	public static void main(String[] args) 
	{
		String s = "bitter better";
		
		String newString[] = s.split(" ");
		 //System.out.println(s + " " +newString);
		Map<Character, Integer> frequencyCount = new HashMap<Character, Integer>();

      /* for(int i=0;i<s.length();i++)
       {
    	   char key= s.charAt(i);
    	   if(frequencyCount.containsKey(key))
    	   {
    		   int value=frequencyCount.get(key);
    		   frequencyCount.put(key, value+1);
    		   
    	   }
    	   else
    	   {
    		   frequencyCount.put(key, 1);
    	   }
       }
       System.out.println("duplicate char in :");
       System.out.println(frequencyCount);*/
		if (newString != null && newString.length > 0) 
		{

			for (int i = 0; i < newString.length; i++) 
			{

				String word = newString[i];
				System.out.println(word);
				for (int j = 0; j < word.length(); j++) 
				{
					char key = word.charAt(j);

					if (key == ' ')
						break;
					if (frequencyCount.containsKey(key)) 
					{
						int occurence = frequencyCount.get(key);
						frequencyCount.put(key, occurence + 1);
					} else 
					{
						frequencyCount.put(key, 1);
					}

				}

			}

		} 
		else
		{
			System.out.println("please Enter Valid String.You Entered Wrong String");
		}

		System.out.println(frequencyCount);
		
		
//		  frequencyCount.forEach((k,v) -> 
//		  {
//			  //if(v>1)
//			  
//			  System.out.println(k+":"+v);
//		      
//		  });
//		 

	}
}
