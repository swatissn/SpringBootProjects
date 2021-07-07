
public class ReverseString1 
{
	public static void main(String[] args) 
	{
		String str="java is best  programming language";
	    
		//String[] str2= str.split(" ");
	     
		for(int i=str.length()-1;i>=0;i--)
		{
	
			System.out.print(str.charAt(i));
			//System.out.print(str2[i]+ " ");
		}
	
		
	}

}
