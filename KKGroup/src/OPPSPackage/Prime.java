package OPPSPackage;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) 
	{
		int no,temp=0;
		System.out.println("enter no:");
		Scanner sc = new Scanner(System.in);
		no=sc.nextInt();
		
		for(int i=2;i<no-1;i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
			
		}
		if(temp==0)
		{
			System.out.println(no+" is prime");
		}
		else
		{
			System.out.println(no+ " is not prime");
		}
		
		// TODO Auto-generated method stub

	}

}
