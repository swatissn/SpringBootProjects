package PracticePackage;

public class Teacher implements Comparable<Teacher>
{
	private int tid;
	
	private String tname;
	
	private float salary;

	public Teacher(int tid, String tname, float salary)
	{
		
		this.tid = tid;
		this.tname = tname;
		this.salary = salary;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() 
	{
		return "Teacher [tid=" + tid + ", tname=" + tname + ", salary=" + salary + "]";
	}
  //bi teacher id
	@Override
	public int compareTo(Teacher t1) 
	{
		// TODO Auto-generated method stub
		Integer i1=(Integer)t1.getTid();
		
		//return i1.compareTo(this.getTid());
		return -i1.compareTo(this.getTid());
		
	}

	
	
		

}
