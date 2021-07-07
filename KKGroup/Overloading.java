
class parent
{
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
		
		o.m1(10);
		o.m1(12.9);
		o.m1(12.5f);	
	}

}
