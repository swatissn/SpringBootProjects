package OPPSPackage;

abstract class A
{
	A()
	{
		System.out.println("A class Constructor");
	}
	public void m1()
	{
		System.out.println("m1() method");
	}
	abstract public void m2();
	
}
public class  abstractdeno extends A
{
	public void m1()
	{
		System.out.println("m1() method");
	}
	
	/*public abstractdeno(int a) {
		// TODO Auto-generated constructor stub
	}*/
 public static void main(String[] args) 
 {
	 abstractdeno a=new abstractdeno();
	 a.m1();
	
}

@Override
public void m2() {
	// TODO Auto-generated method stub
	
}
}
 
