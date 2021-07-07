package ComparableSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetSortingComparable 
{
	public static void main(String[] args)
	{
		HashSet<Employee> hs = new HashSet<Employee>();
		hs.add(new Employee(90,"swati"));
		hs.add(new Employee(23,"vaishu"));
		hs.add(new Employee(47,"komal"));
		hs.add(new Employee(21,"rani"));
		hs.add(new Employee(34,"priya"));
		System.out.println(hs);
		List<Employee> list = new ArrayList<Employee>(hs);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
