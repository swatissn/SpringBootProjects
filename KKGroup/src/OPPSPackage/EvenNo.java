package OPPSPackage;

public class EvenNo 
{

	public static void main(String[] args) 
	{
		int i,no=3;
		
	
		for( i=1;i<=100;i++)
		{
			try{
			if(no%i==0)
			{
				
			System.out.println(" no is prime:"+i);
			
			}
			else
			{
				//System.out.println("\n no is not prime:"+i);
			}
		}
			catch(Exception e)
			{
				
			}
		}
		
	}// TODO Auto-generated method stub

	}


