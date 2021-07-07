package CollectioPracticeExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

class Employee {
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

}

public class IterateArraylist {
	public static void main(String[] args) {
			String name;
		Employee e = new Employee("swati");
		Employee e1 = new Employee("rani");
		Employee e2 = new Employee("pratibha");
		Employee e3 = new Employee("karishma");

		List<Employee> l = new ArrayList<Employee>();
		l.add(e);
		l.add(e1);
		l.add(e2);
		l.add(e3);

		Iterator itr = l.iterator();
		while (itr.hasNext()) 
		{
		
			Iterator emp=(Iterator)itr.next();
			
		

			

		}

	}
}


