package PracticePackageDemo;

import java.util.Scanner;

public class Stringpaindrom
{
	public static void main(String[] args)
	{
		String str, rev="";
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter String:");
		str= sc.nextLine();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}
		
	}

}
