package PracticePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistByUsingComparable 
{
	public static void main(String[] args)
	{
		ArrayList<Employee1> list = new ArrayList<Employee1>();
		list.add(new Employee1(20,"swati",33000.0));
		list.add(new Employee1(10,"priya",200000));
		list.add(new Employee1(37,"kiran",10000));
		list.add(new Employee1(5,"rani",50000));
		
	   Collections.sort(list);
		System.out.println(list);
		
	}

}
