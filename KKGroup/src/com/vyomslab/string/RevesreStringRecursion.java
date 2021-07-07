package com.vyomslab.string;

public class RevesreStringRecursion
{
	public static void main(String[] args)
	{
		String str="swati";
		String reve= reverse(str);
		System.out.println(reve);
		
		
	}
	public static String reverse(String str)
	{
		if((str==null)||(str.length()<=1))
				
				return str;
		else
			    return reverse(str.substring(1))+str.charAt(0);
		
	}

}
