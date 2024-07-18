package CollectionMapExceptionAndThread;
import java.util.*;
public class LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedHashMap l=new LinkedHashMap();
        do 
        {
        	Scanner s=new Scanner(System.in);
        	System.out.println("1:Add new element in map store key as number and value as string");
        	System.out.println("2:view all employee from collection");
        	System.out.println("3:search employee by using its id");
        	System.out.println("4:delete employee by using its id");
        	
        	System.out.println("Enter your choice");
        	int choice=s.nextInt();
        	switch (choice)
        	{
        	case 1:
        		System.out.println("enter key");
        		int id=s.nextInt();
        		s.nextLine();
        		System.out.println("enter the value");
        		String value=s.nextLine();
        		l.put(id,value);
        		break;
        	case 2:
        		Set keys=l.keySet();
        		
        	}
        	
        }
	}

	

}
