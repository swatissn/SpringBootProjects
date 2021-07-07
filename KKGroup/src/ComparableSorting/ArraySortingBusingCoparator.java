package ComparableSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Vector;

public class ArraySortingBusingCoparator
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student(12,"swati"));
		list.add(new Student(45,"mithu"));
		list.add(new Student(23,"soni"));
		list.add(new Student(78,"priya"));
		list.add(new Student(20,"kiran"));
		
		Collections.sort(list,new MyComparator());
		System.out.println(list);
		
		
	}

}
class MyComparator implements Comparator<Student>
{

	@Override
	public int compare(Student obj1,Student obj2)
	{
		//return obj1.getName().compareTo(obj2.getName());
		Integer I1=obj1.getId();
		Integer I2=obj2.getId();
		return I1.compareTo(I2);
		
		
	}
}

		
/*ArrayList<Student> list = new ArrayList<Student>();
list.add(new Student(1,"swati"));
list.add(new Student(2,"ranu"));
list.add(new Student(3,"priyanka"));
list.add(new Student(4,"komal"));

Collections.sort(list, new MyComparator());
System.out.println(list);
	
	}
}
	class MyComparator implements Comparator<Student>
	{

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.compareTo(o2);
			Integer i1=o1.getId();
			Integer i2=o2.getId();
			return i1.compareTo(i2);
		}
		
	}

*/