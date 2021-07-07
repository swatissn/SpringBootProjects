
public class StaticBlockAndVariable 
{
	static
	{
		System.out.println("static block 1");
	}
	{
		System.out.println("instance block");
		
	}
	StaticBlockAndVariable()
	{
		System.out.println(" constructor called");
	}
	public static void m1()
	{
		System.out.println("static method");
	}
	public static void main(String[] args) 
	{
		StaticBlockAndVariable s = new StaticBlockAndVariable();
		m1();
		
	}
	
	/*int x =10;
	//static y=20;
	
	public static void main(String[] args) 
	{
		
		StaticBlockAndVariable s = new StaticBlockAndVariable();
		System.out.println(s.x);
	}*/
	
	

}
