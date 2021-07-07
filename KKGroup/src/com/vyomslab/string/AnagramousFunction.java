package com.vyomslab.string;

import java.util.Arrays;

public class AnagramousFunction 
{
 static boolean areAnagram(char[] str1,char[] str2)
	{
		int n1=str1.length;
		int n2=str2.length;
		
     	/*if(n1!=n2)
		return false;*/
		
		//sort both array
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		//compare two string
		for(int i=0;i<n1;i++)
		
			if(str1[i]!=str2[i])
				return false;
			return true;
		
		
		
	}
	public static void main(String[] args)
	{
		String s1="cat";
		String s2="tac";
		char[] str1= s1.toCharArray();
		char[] str2= s2.toCharArray();
		//String str1= "cat";
		//String str2= "tac";
		
		if(areAnagram(str1,str2))
		
			System.out.println("two string are anogramous of each other");
		else
			System.out.println("two string are not anagramous of each other");
		
	}

}
