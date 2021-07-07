package com.vyomslab.string;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCountOfWord 
{
	public static void main(String[] args) 
	{
		String s="java is programming language, #java is very easy";
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		String[] stringArray=s.split("[, #]");
	
		for(int i=0;i<stringArray.length;i++)
		{
			String word=stringArray[i];
			if(word == null || word.isEmpty())
				continue;
			if(map.containsKey(word))
			{
				int occurance=map.get(word);
				map.put(word, occurance+1);
			
			}
			else
			{
				map.put(word, 1);
			}
			
		}
		
		System.out.println(map);
		
		map.forEach((k,v)->
		{
			System.out.println(k+":"+v);
		});
		
	}
	
}
