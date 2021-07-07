
public class FibinaciiSeries 
{
	public static void main(String[] args) 
	{
		int no1=0,no2=1,result,count=10;
		
		System.out.print(no1+ " " +no2);
		for(int i=0;i<count;i++)
		{
			result=no1+no2;
			System.out.print( " "+result);
			no1=no2;
			no2=result;
			
		}
		
	}

}
