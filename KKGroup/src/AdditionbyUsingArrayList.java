import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class AdditionbyUsingArrayList 
{

		public static void main(String[] args) {
			int total=0,length;
			ArrayList<Integer> al=new ArrayList<Integer>();
			al.add(50);
			al.add(4);
			al.add(12);
			al.add(86);
			al.add(34);
			System.out.println("Before Sorting :"+al);
			Collections.sort(al);
			System.out.println("After Sorting : "+al);
			total=al.get(0)+al.get(3);
//			total=al.get(0)+al.get(al.size()-1);
			System.out.println(total);
			
		}
}