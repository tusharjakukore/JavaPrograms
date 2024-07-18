package test;
import java.util.*;
class Overloding
{ 
	int x[],index,temp;
	void SetArray(int x[])
	{
		this.x=x;
		int i,j;
		for(i=0;i<x.length;i++)
		{
			for(j=i+1;j<x.length;j++);
			{
				if(x[i]>x[j])
				{
				    temp=x[i];
				    x[i]=x[j];
				    x[j]=temp;
				}
			}
		}
		for( i=0;i<x.length;i++)
		{
		     System.out.println(x[i]);
		}
		
	}
	void SetArray(int x[],int index)
	{
		this.x=x;
		this.index=index;
		
	}
}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner xyz=new Scanner(System.in);
		int index;
		int x[]=new int[5];
		System.out.println("Enter five values in array\n");
		for(int i=0;i<x.length;i++)
		{
		    x[i]=xyz.nextInt();
		}
		Overloding o=new Overloding();
		o.SetArray(x);
		System.out.println("Enter index for delete element");
		index=xyz.nextInt();
		
    	o.SetArray(x,index);
		

	}

}
