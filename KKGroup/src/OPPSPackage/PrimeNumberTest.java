package OPPSPackage;

public class PrimeNumberTest {
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if(i==1 || i==3 || i==5 || i==7 )
				System.out.println(i);
			else if (i % 2 == 0)
				continue;
			else if (i % 3 == 0)
				continue;
			else if (i % 5 == 0)
				continue;
			else if (i % 7 == 0)
				continue;
			else
				System.out.println(i);
		}
	}
}
