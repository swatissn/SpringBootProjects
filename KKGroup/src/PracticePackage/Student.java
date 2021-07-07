package PracticePackage;

public class Student
{
	private int sid;
	
	private String sname;
	
	private double salary;

	public Student(int sid, String sname, double salary) 
	{
		
		this.sid = sid;
		this.sname = sname;
		this.salary = salary;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", salary=" + salary + "]";
	}
	
	
	

}
