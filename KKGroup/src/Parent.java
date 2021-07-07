

public class Parent 
{
	public  void m1()
	{
		System.out.println("paret method");
	}

}
class child extends Parent
{
	
	public void m1()
	{
		System.out.println("child method");
	}
	public static void main(String[] args) 
	{
		
	
	
	Parent p=new Parent();
	p.m1();
	
	}
	
}
