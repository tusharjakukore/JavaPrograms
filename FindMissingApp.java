package New;
import java.util.*;
class FindMissing
{ 
	int a[];
	int no;
	void setArray(int a[])
	{
		this.a=a;
		
	}
	void findMissingEle(int no)
	{
		this.no=no;
		int sumofAll=(no*(no-1))/2;
		int sumArray=0;
		for(int i=0;i<no-2;i++)
		{
			sumArray=sumArray+a[i];
		}
		int MissingNo=sumofAll-sumArray;
		System.out.println("Missing numner is : "+MissingNo);
	}
}
public class FindMissingApp
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n value");
		int no=s.nextInt();
		System.out.println("Enter values in array");
		int a[]=new int [no];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=s.nextInt();
		}
        FindMissing fm=new FindMissing();
        fm.setArray(a);
        fm.findMissingEle(no);
	}
}
