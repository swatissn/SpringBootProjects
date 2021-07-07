
public class StarPattern3 
{
	public static void main(String[] args) {
		int n=5,k=5;
		for(int i=1;i<=n;i++)
		{
			k=5;
			for(int j=1;j<=6-i;j++)
			{
//				if(j<=6-i)
//				{
					System.out.print(k+" ");
					k--;
//				}
//				else
//				{
//					System.out.print(" ");
//				}
			}
			System.out.println();
		}
	}
}
