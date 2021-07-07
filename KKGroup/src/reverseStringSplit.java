
public class reverseStringSplit 
{
	public static void main(String[] args) 
	{
		String s1="i love india";
		//String s1="swati";
		
		String[] s2= s1.split(" ");
		
		for(int i=s2.length-1;i>=0;i--)
		{
			System.out.println(s2[i]+ "");
			
		}
		
		
	}

}
