

public class StringReverseDemo {
	public static void main(String[] args)
	{
		//String st = "sachin";
		//StringBuilder st = new "StringBuilder("swati");
		StringBuffer st = new StringBuffer("swati");

		//System.out.println(reverseString(st));
		System.out.println(st.reverse());

	}

//	private static String reverseString(String st) {
//		StringBuffer temp = new StringBuffer();
//		int len = st.length();
//		
//		String s= "swati";
//
//		for (int i = len-1; i >= 0; i--)
//		{
//			
//			temp.append(st.charAt(i));
//		}
//
//		return temp.toString();
//	}
}
