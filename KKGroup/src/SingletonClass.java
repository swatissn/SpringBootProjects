

public class SingletonClass 
{
	private static SingletonClass obj=null;
	 private SingletonClass()
	{
		System.out.println("this private constructor not accessabal to user");
	}
	
	public static SingletonClass getObject()
	{
		if(obj==null)
		{
			obj=new SingletonClass();
	    }
	  System.out.println("getInstance");	
	
	  return obj;
	}
	
	public static void main(String[] args) 
	{
		obj.getObject();
		obj.getObject();
		obj.getObject();
		
	}

}
