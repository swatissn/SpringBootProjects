package PracticePackage;

public class Employee1 implements Comparable<Employee1>
{
	private int eid;
	
	private String ename;
	
	private double salary;

	Employee1(int eid,String ename,double salary)
	{
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
		
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
//    by employee ename
	/*@Override
	public int compareTo(Employee1 o) 
	{
		// TODO Auto-generated method stub
		return this.getEname().compareTo(o.getEname());
	}
*/
//	by employee eid
	/*@Override
	public int compareTo(Employee1 o) 
	{
		// TODO Auto-generated method stub
		Integer I1 = (Integer)o.getEid();
		return -I1.compareTo(this.getEid());
	}*/
//by employee salary
	/*@Override
	public int compareTo(Employee1 o) 
	           {
		    Double salary = (Double)o.getSalary();
		    return salary.compareTo(this.getSalary());
				}
	*/

	@Override
	public int compareTo(Employee1 o) 
	{
		// TODO Auto-generated method stub
		Integer I1 = (Integer)o.getEid();
		return -I1.compareTo(this.getEid());
	}
	

}
