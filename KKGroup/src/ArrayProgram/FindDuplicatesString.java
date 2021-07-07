package ArrayProgram;

public class FindDuplicatesString
{
	public static void main(String[] args) 
	{
		
	
	String[] str={"swati","swati","rani","rani","sachin","nagode"};
	
     System.out.println("duplicates in String:");
     for(int i=0;i<str.length;i++)
     {
    	 for(int j=i+1;j<str.length;j++)
    	 {
    		 if(str[i]==str[j])
    		 {
    			 System.out.println(str[j]+ " ");
    		 }
    	 }
     }
	}

}
