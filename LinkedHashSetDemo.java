package LinkedHashSet.org;
import java.util.*;

public class LinkedHashSetDemo
{

	public static void main(String[] args) 
	{
        Set set = new LinkedHashSet();
		
		set.add(1);
		set.add('S');
		set.add("Sayali");
		set.add(23);
		set.add(3.4);
		set.add(true);
		set.add(null);
		set.add(0);
		set.add(155);
		set.add(false);
		set.isEmpty();
		System.out.println(set);
		//set.get(5);

		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.contains(23));
		
		System.out.println(set.remove(23));
		System.out.println(set.removeAll(set));
		
		Set set1=new LinkedHashSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add("Pune");
		set1.add("Mumbai");
		set1.add("Delhi");
		
		System.out.println(set.addAll(set1));
		System.out.println(set);
		
		LinkedHashSet<String> lhs= new LinkedHashSet<String>();
		lhs.add("Pune");
		lhs.add("Mumbai");
		lhs.add("Delhi");
		System.out.println(lhs);

	}

}
