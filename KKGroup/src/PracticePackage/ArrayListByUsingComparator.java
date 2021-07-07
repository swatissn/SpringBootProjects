package PracticePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListByUsingComparator 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(10,"swati",10000));
		list.add(new Student(20,"rani",20000));
		list.add(new Student(5,"priya",50000));
		
		Collections.sort(list, new MyComparator());
		
		System.out.println(list);
		
	}

}
class MyComparator implements Comparator<Student>
{
 //by salary
	@Override
	public int compare(Student O1, Student O2) 
	{
		// TODO Auto-generated method stub
		Double d1 = (Double)O1.getSalary();
		Double d2 = (Double)O2.getSalary();
		
		return -d1.compareTo(d2);
	}
  //by sid
	/*@Override
	public int compare(Student o1, Student o2) 
	{
		// TODO Auto-generated method stub
		Integer I1 = (Integer)o1.getSid();
		Integer I2=(Integer)o2.getSid();
		return I1.compareTo(I2);
	}*/
  //by using sname
	/*@Override
	public int compare(Student o1, Student o2) 
	{
	// TODO Auto-generated method stub
		return -o1.getSname().compareTo(o2.getSname()) ;
	}
	*/
	
}
