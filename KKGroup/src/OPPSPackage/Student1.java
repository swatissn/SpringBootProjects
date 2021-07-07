package OPPSPackage;
import java.io.Serializable;

public class Student1 implements Serializable
{
	int id;
	String Fname;
	String Lname;
	
	public Student1(int id, String fname, String lname) {
		super();
		this.id = id;
		Fname = fname;
		Lname = lname;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + "]";
	}
	
	
	

}
