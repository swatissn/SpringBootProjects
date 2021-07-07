package OPPSPackage;

class parent
{
	static
	{
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
	parent()
	{
		System.out.println("parent constructor");
	}
	
		public void m1(int i)
	    {
		System.out.println("parent int method");
	    }
	public void m1(float i)
	{
		System.out.println("parent float method");
	}
}

public class Overloading extends parent
{
	public void m1(double i)
	{
		System.out.println(" child double method");
	}
	
	public static void main(String[] args) 
	{
		Overloading o = new Overloading();


		
		o.m1(10);//parent int method
		o.m1(12.9);//child double method
		o.m1(12.5f);//	parent float method
		o.m1('c');//parent int method
		o.m1(12l);//parent float method
		
	}
}
