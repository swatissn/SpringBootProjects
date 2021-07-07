package ComparableSorting;

public class Employee implements Comparable<Employee> 
{
	private Integer eid;
	private String ename;
	//private float salary;
	public Employee(int eid,String ename)
	{

		this.eid=eid;
		this.ename=ename;

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

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}


	


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.eid.compareTo(o.getEid());
	}

	
	/*@Override
	public int compareTo(Employee o) 
	{
		//by using treeset
		return this.getEname().compareTo(o.getEname());
	}
*/	// @Override
	// public int compareTo(Employee o)
	// {
	// // TODO Auto-generated method stub
	// return this.ename.compareTo(o.ename);
	// }

	/*
	 * @Override public int compareTo(Employee o) 
	 * { //by id
	 *  Integer I1 =this.eid; 
	 *  Integer I2= o.eid; // TODO Auto-generated method stub return
	 * I1.compareTo(I2);
	 *  }
	 */

}
