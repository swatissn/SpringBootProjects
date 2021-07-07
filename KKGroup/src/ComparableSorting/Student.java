package ComparableSorting;

public class Student implements Comparable<Student>

{
	private Integer id;
	private String name;
	public Student(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	/*@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		Integer i1=this.id;
		Integer i2=o.id;
		return i1.compareTo(i2);
	}*/
	
	//by name
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//return this.id.compareTo(o.getId());
		return this.name.compareTo(o.getName());
		
	}

}
	
	



