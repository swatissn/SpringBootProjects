
public class equalAndDotEqualMethod 
{
	public static void main(String[] args) 
	{
		String s1= new String("swati");
		String s2="swati";
		String s3="nagode";
		String s4="swati";
		//if(s1==s2)
		System.out.println(s1==s2);//false
			
		System.out.println(s1.equals(s2));//true
		System.out.println(s2==s3);//false
		System.out.println(s2==s4);//true
		
	}

}
