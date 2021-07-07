package ComparableSorting;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeSetMap
{
	public static void main(String[] args) 
	{
//		Map<String, Integer> map=new HashMap<String,Integer>();
		Map<String, Integer> map=new TreeMap<String,Integer>(Comparator.reverseOrder());
		 
		map.put("Kiran", 98);
		map.put("Rutuja", 2);
		map.put("Pooja", 54);
		map.put("Balu", 45);
		map.put("Sarthak", 8);
		map.put("Banti", 5);

		System.out.println(map);
		
	}
}

/*class MyComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		
		
		
		return o1.toString().compareTo(o2.toString());
	}

}*/