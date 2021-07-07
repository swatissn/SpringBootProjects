package PracticePackage;

public class Teacher1 implements Comparable<Teacher1>
{
	private int id;
	
	private String name;
	
	private double salary;

	public Teacher1(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "Teacher1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
    //by id
	@Override
	public int compareTo(Teacher1 o) 
	{
		// TODO Auto-generated method stub
		Integer i1= (Integer)o.getId();
		
		
		return -i1.compareTo(this.getId());
	}
	
	

}
