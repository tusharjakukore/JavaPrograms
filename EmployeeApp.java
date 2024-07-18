package New;
import java.util.*;
class Employee implements Comparable
{
	private int id;
	private String name;
	public Employee(int id,String name,int sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getSal()
	{
		return sal;
	}
	public void setSal(int sal)
	{
		this.sal = sal;
	}
	private int sal;
	public int compareTo(Object obj)
	{
		Employee e = (Employee)obj;
		if(this.id>e.id)
		{
			return 1;
		}
		else if(this.id<e.id)
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}
}


public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		Employee emp1 = new Employee(1,"kalpesh",14000);
		Employee emp2 = new Employee(2,"dishant",45000);
		Employee emp3 = new Employee(33,"aniket",30000);
		Employee emp4 = new Employee(12,"gokarn",20000);
		Employee emp5 = new Employee(4,"d",50000);
		
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		al.add(emp5);
		
		System.out.println();
		System.out.println("Before Sorting");
		for(Object obj:al)
		{
			Employee e = (Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
		
		Collections.sort(al);
		System.out.println("After Sorting");
		for(Object obj:al)
		{
			Employee e = (Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
	}

}
