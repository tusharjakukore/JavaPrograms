package HashSet.org;
import java.util.*;

public class HashSetDemo 
{
	public static void main(String[] args)
	{
		HashSet<Integer> set=new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		
		System.out.println(set);
		
		if(set.contains(1))
		{
			System.out.println("set contains");
		}
		
		set.remove(5);
		
		System.out.println("size of set is:"+set.size());
		
		
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
