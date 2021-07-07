

public class StarPattern2
{
	public static void main(String[] args) 
	{
		int n=5;
		//int k=1;
		//char ch = 'A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				                                      //if(i==1||i==n||j==1||j==n)  
				if((j>=6-i) && (j<=4+i)) //(j<=i)
				{
					System.out.print("*");
				 	
//					System.out.print(k+ " ");
//				       k++;
				
//				System.out.print(ch+ " ");
//					ch++;
			    }
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println ();
		}
		
		
	}

}
