package OPPSPackage;

class AB
{
	static
	{
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
	AB()
	{
		System.out.println();
	}
	public void m1()
	{
		System.out.println("ab m1() method");
	}
}
public class Overriding extends AB
{
	public void m1()
	{
		System.out.println("ab child m1() method");
	}
	public static void main(String[] args) 
	{
		AB o = new Overriding();
		AB o1 =new AB();
		o1.m1();
		
		o.m1();
		
	}

}
