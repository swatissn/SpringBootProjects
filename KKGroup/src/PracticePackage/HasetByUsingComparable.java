package PracticePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HasetByUsingComparable {

	public static void main(String[] args) 
	{
		HashSet<Teacher> set = new HashSet<Teacher>();
		
		set.add(new Teacher(20,"ganesh",20000));
		set.add(new Teacher(10,"priya",10000));
		set.add(new Teacher(5,"komal",350000));
		
		ArrayList<Teacher> list =new ArrayList<Teacher>(set);
		Collections.sort(list);
		System.out.println(list);
		// TODO Auto-generated method stub

	}

}
