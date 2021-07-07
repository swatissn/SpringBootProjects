package PracticePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TreeSetbyusingComparable 
{
	public static void main(String[] args) 
	{
		TreeSet<Teacher1> treeset = new TreeSet<Teacher1>();
		treeset.add(new Teacher1(20,"swati",20000));
		treeset.add(new Teacher1(10,"priti",10000));
		treeset.add(new Teacher1(40,"komal",40000));
		 
		ArrayList<Teacher1> list =new ArrayList<Teacher1>(treeset);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
