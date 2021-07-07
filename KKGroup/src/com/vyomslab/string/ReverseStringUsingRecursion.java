package com.vyomslab.string;
//Java program to reverse a string using recursion 
public class ReverseStringUsingRecursion 
{
	
	   /* Function to print reverse of the passed string */
	 private  static String reverse(String str) 
	    { 
	        if ((str==null)||(str.length() <= 1)) 
	        //{
	         return str;
	        //}
	        else
	        	
	        return reverse(str.substring(1)) + str.charAt(0); 
	        
	    } 
	      
	    /* Driver program to test above function */
	    public static void main(String[] args)  
	    { 
	        String str = "Geeks"; 
	       // ReverseStringUsingRecursion obj = new ReverseStringUsingRecursion(); 
	         String rev = reverse(str); 
	        System.out.println("reverse string is:" +rev);
	    }     
	 

}
