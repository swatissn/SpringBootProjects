package ComparableSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class HashSetComparator 
{
	public static void main(String[] args) 
	{
		HashSet<Employee> hs = new HashSet<Employee>();
		hs.add(new Employee(23,"swati"));
		hs.add(new Employee( 45,"priya"));
		hs.add(new Employee(20,"komal"));
		hs.add(new Employee(10,"didi"));
		hs.add(new Employee(20,"suvarna"));
		
		ArrayList<Employee> list = new ArrayList<Employee>(hs);
		Collections.sort(list,new MyComparator1());
		
		System.out.println(list);
		
	}

}
class MyComparator1 implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) 
	{
		//by id
		Integer I1 =o1.getEid();
		Integer I2 =o2.getEid();
		
		return I1.compareTo(I2);
		
		// TODO Auto-generated method stub
		//by Ename
		//return o1.getEname().compareTo(o2.getEname());
	}
	
}