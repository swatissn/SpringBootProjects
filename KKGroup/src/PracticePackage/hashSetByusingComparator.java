package PracticePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class hashSetByusingComparator
{
	public static void main(String[] args) {
		HashSet<Teacher> set =new HashSet<Teacher>();
		set.add(new Teacher(30,"swati",330000));
		set.add(new Teacher(20,"rani",20000));
		set.add(new Teacher(10,"priya",30000));
		
		ArrayList<Teacher> list=new ArrayList<Teacher>(set);
		
		Collections.sort(list, new MyComparator1());
		System.out.println(list);
		
		
	}

}
class MyComparator1 implements Comparator<Teacher>
{

	@Override
	public int compare(Teacher t1, Teacher t2) {
		// TODO Auto-generated method stub
		Integer i1=(Integer)t1.getTid();
		Integer i2=(Integer)t2.getTid();
		
		return -i1.compareTo(i2);
	}

	/*@Override
	public int compare(Teacher t1, Teacher t2) 
	{
		// TODO Auto-generated method stub
		return -t1.compareTo(t2);
	}
*/
	/*@Override
	public int compare(Teacher t1, Teacher t2) 
	{
		// TODO Auto-generated method stub
		Float f1=(Float)t1.getSalary();
		Float f2=(Float)t2.getSalary();
		
    		
		return -f1.compareTo(f2);
	}*/
	
}
