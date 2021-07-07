
public class Star 
{
	public static void main(String[] args) 
	{
		
		for (int i = 1; i <= 4 ; i++) {
			
			String concat = new String();
			
			for (int j = i; j > 0 ; j--) {
				
				
				concat = concat +j;
				
			}
			
			System.out.println(concat);
			
		}
		
		
	}

}
