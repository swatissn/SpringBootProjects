package ComparableSorting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSortByComparable 
{
	public static void main(String[] args)
	{
		TreeSet<Employee> tree = new  TreeSet<Employee>();
//		Employee emp=new Employee("Swati",12);
//		Employee emp1=new Employee("kiran",34);
//		tree.add(emp1);
//		tree.add(emp);
		
		
		tree.add(new Employee(12,"Swati"));
		tree.add(new Employee(34,"Kiran"));
		tree.add(new Employee(20,"Priya"));
		tree.add(new Employee(50,"Divya"));
		tree.add(new Employee(40,"Sonal"));
		tree.add(new Employee(56, "Rutuja"));
		System.out.println(tree);
		
	}

}
