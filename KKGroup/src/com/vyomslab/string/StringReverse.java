package com.vyomslab.string;

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

import org.omg.Messaging.SyncScopeHelper;

public class StringReverse 
{
	public static void main(String[] args) 
	{
		String s="kiran kardile swati nagode";
		for(int i=s.length()-1;i>=0;i--)
		{
			//if(s.charAt(i)!=' ')
			
			System.out.print(s.charAt(i));
			
		}
		/*
		byte a=10;
		short b=20;
		
		
		
		System.out.println(a=(byte)(a+b));
		System.out.println(a+=b);*/
		
		/*HashMap<String , Integer> map=new HashMap<>();
		map.put("Kiran", 1);
		map.put("Sagar", 2);
		System.out.println(map);*/
	}
}
