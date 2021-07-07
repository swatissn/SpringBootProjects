package com.kd.comparable;


import java.util.Comparator;

class myComparator implements Comparator<Student> 
{

	
//Descending by name
//	@Override
//	public int compare(Student o1, Student o2)
//	{
//		
//		return -o1.getName().compareTo(o2.getName());	
//		
//	}
	
	//Ascending Order by salary
	@Override
	public int compare(Student o1, Student o2) 
	{
		if(o1.getSalary()<o2.getSalary())
		return -1;
		
		else if(o1.getSalary()>o2.getSalary())
			return 1;
		return 0;
	}
	
	//Ascending order by DOB
	

}
