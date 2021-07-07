package OPPSPackage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable
{
	public static void main(String[] args) throws IOException 
	{
		Student1 stud = new Student1(101,"swati","nagode");
		
		FileOutputStream fout = new FileOutputStream("rutu.kale");
		
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		
		out.writeObject(stud);
		
		out.flush();
		
		fout.close();
		
		System.out.println(stud);
	}

}
