package ComparableSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSortbyComparator
{
	public static void main(String[] args) {
		
		TreeSet<Employee> tree= new TreeSet<Employee>();
		tree.add(new Employee(1,"swati"));
		tree.add(new Employee(2,"rani"));
		tree.add(new Employee(3,"komal"));
		tree.add(new Employee(4,"sakshi"));
		System.out.println(tree);
		ArrayList<Employee> list= new ArrayList<Employee>(tree);
		Collections.sort(list, new MyComparator2());
		System.out.println(list);
		
	}

}
class MyComparator2 implements Comparator<Employee>
{

	
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEname().compareTo(o2.getEname());
		/*Integer i1= o1.getEid();
		Integer i2=o2.getEid();
		return i1.compareTo(i2);*/
	}
	
}
