
abstract class A
{
	static
	{
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
	A()
	{
		System.out.println("A class Constructor");
	}
	public static void m1()
	{
		System.out.println("m1() method");
	}
	abstract public void m2();
	
}
public class  abstractdeno extends A
{
	
	
	/*public abstractdeno(int a) {
		// TODO Auto-generated constructor stub
	}*/
 public static void main(String[] args) 
  {
	 abstractdeno a=new abstractdeno();
	 //A a1= new abstractdeno();
	 
	 a.m1();
	 a.m2();
	 //a1.m1();
	 
	
  }

@Override
public void m2() {
	// TODO Auto-generated method stub
	System.out.println("child m2 method");
	
}
}
 
