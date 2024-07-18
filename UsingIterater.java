package Linkeslist.com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class UsingIterater 
{
	public static void main(String[] args) 
	{
		 LinkedList<Integer> linkedList = new LinkedList<>();
	        linkedList.add(1);
	        linkedList.add(2);
	        linkedList.add(3);

	        System.out.println("Peek: " + peek(linkedList));

	        System.out.println("Element: " + element(linkedList));

	        Iterator<Integer> iterator = linkedList.iterator();
	        while (iterator.hasNext()) 
	        {
	            System.out.println(iterator.next());
	        }    
	  }

	public static Integer element(LinkedList<Integer> linkedList) {
		
		LinkedList<Integer> list = list;
		if (!list.isEmpty()) 
		{
	            return list.getFirst();
	    }
		else
		{
	            return null;
	    }
	}

	private static Integer peek(LinkedList<Integer> linkedList) {
		 LinkedList<Integer> list = linkedlist;
		if (!list.isEmpty())
		 {
	            return list.getFirst();
	     }
		 else
		 {
	            throw new NoSuchElementException("LinkedList is empty");
	        }
	}
	    

}