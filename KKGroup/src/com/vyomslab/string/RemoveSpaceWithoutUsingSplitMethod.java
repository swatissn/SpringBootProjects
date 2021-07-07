package com.vyomslab.string;

public class RemoveSpaceWithoutUsingSplitMethod 
{
	public static void main(String[] args)
	{
		String s="Jspm Group Of Institute Hadapsar";		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) !=' ')
			System.out.print(s.charAt(i));
		}
	}
}
