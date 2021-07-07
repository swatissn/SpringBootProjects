package ComparableSorting;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySortingByComparable 
{
	public static void main(String[] args)
	{
		/*ArrayList list =new ArrayList();
		
		list.add(new Student("swati",35));
		list.add(new Student("kiran",13));
		list.add(new Student("rani",10));
		list.add(new Student("didi",15));
		list.add(new Student("priya",19));
		
		Collections.sort(list);
		System.out.println(list);
		*/
	
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(1,"swati"));
		list.add(new Student(2,"rani"));
		list.add(new Student(3,"pratibha"));
		list.add(new Student(4,"komal"));
		Collections.sort(list);
		System.out.println(list);
	}

}
