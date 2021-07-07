package com.kd.comparable;


import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class SortStudentDemo 
{
	public static void main(String[] args) {
		
		ArrayList<Student> set = new ArrayList<Student>();
		
		Student s1 = new Student(10, "Kiran", new Date(1997,11,11), 40000);
		Student s2 = new Student(11, "Sachin", new Date(1992,10,04), 100700);
		Student s3 = new Student(12, "Swati", new Date(1995,04,12), 55000);
		
		Student s4 = new Student(10, "Kiran", new Date(1997,11,11), 40000);
		Student s5 = new Student(11, "Sachin", new Date(1992,10,04), 100700);
		Student s6 = new Student(12, "Swati", new Date(1995,04,12), 55000);
		
		set.add(s1);set.add(s2);set.add(s3);//set.add(s4);set.add(s5);set.add(s6);
		
		/*
			Write your code here to sort,
			Also , provide natural sorting order by using id 
			and custom sorting order using name,DOB, Salary
		*/
		Collections.sort(set,new DateComparator());
		System.out.println(set);
		
	}
}

