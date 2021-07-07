package ArrayProgram;

public class FindlargestArray 
{
	public static void main(String[] args)
	{
		 int[] a = {10,5,15,12,56,78};
		 int length,temp;
		 System.out.println("befor sorting:");
		 for(int x:a)
		 {
			 System.out.print(x+ " ");
		 }
		 //System.out.println("\nafter sorting:");
		 for(int i=0; i<=a.length; i++)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]>a[j])
				 {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
			 
		 }
		System.out.println("\nafter sorting:");
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+ ",");
		 }
//			 for(int x:a)
//			 {
//				System.out.print(x+ " "); 
//			 }
			 System.out.println("\nlargest no :"+a[a.length-1]);
			 System.out.println("second highest largest no:"+a[a.length-2]);
			 
		 
	}
}
		 
