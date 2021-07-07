package PracticePackage;

public class EventElementInArray
{
	public static void main(String[] args) 
	{
		
    Integer[] array={1,2,2,1,3,3,4,5,6};
		
		System.out.println("duplicates element in array:");
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					 System.out.println(array[i]+ " ");
					 
					
				}
				
			}
//System.out.println("even no is:");
			if(i%2==0)
			{
				System.out.println(array[i]+ " ");
			}
		}
				
	}

}
