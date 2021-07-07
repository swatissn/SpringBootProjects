
public class reverseString 
{
	public static void main(String[] args)
	{
		//StringBuffer s = new StringBuffer("swati");
		//StringBuilder s = new StringBuilder("swati");
	    
		String s="swati";
		
	   // int length;
	    
		for(int i=s.length()-1; i>=0; i--)
	    {
	    	System.out.println(s.charAt(i));
	    }
	}
}
