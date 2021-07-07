package com.vyomslab.string;

import java.io.IOException;
import java.util.Scanner;

public class StringIsPalinDrom 
{
	/*public static void main(String[] args) 
	{
		String str,rev="";
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter String:");
		
		str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		if(str.equals(rev))
         {
	      System.out.println("string is palindrom");
         }
         else
         {
        System.out.println("string is not palindrom"); 
         }
       
	}*/
	//by using function check palindrom
	public static void checkPalindrom(String str)
	    {
		String reverse=new StringBuffer(str).reverse().toString();
		if(str.equals(reverse))
		
			System.out.println("String is palingrom");
		    
		   else
		
			System.out.println("String is not palindrom");
		}
	 
	  public static void main(String[] args) //throws java.lang.Exception
	   {
		
		checkPalindrom("mom");
		
	   }
}
