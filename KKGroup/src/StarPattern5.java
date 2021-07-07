import java.util.Scanner;

public class StarPattern5 
{
	public static void main(String[] args) {
		int no;
		System.out.println("Enter no of rows : ");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=no;j++)
			{
				if(i==1 || j==1 || j==no || i==no)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		
	}
}
