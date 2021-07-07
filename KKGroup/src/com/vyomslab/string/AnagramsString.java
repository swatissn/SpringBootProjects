package com.vyomslab.string;

import java.util.Arrays;

public class AnagramsString 
{
	public static void main(String[] args) 
	{
		String S1="cat";
		String S2="tac";
		
		if(S1.length()==S2.length())
		{
			char[] array1 = S1.toCharArray();
			Arrays.sort(array1);
			System.out.println(Arrays.toString(array1));
			
			char[] array2=  S2.toCharArray();
			Arrays.sort(array2);
			System.out.println(Arrays.toString(array2));
			System.out.println(Arrays.equals(array1, array2));
			
			if(array1.equals(array2))
			{
				System.out.println("Given String are anagram ");
			}
			else
			{
				System.out.println("Given String are not anagram");
			}
		}
		
		
	}

}

