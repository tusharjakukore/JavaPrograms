package test;

import java.util.*;
class Sort
{
	int a[];
	void AcceptArray(int a[])
	{
		this.a=a;
	}
	void Disply() 
	{
		int i,j;
		for(i=0;i<a.length;i++)
		{
			int temp;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				    temp=a[i];
				    a[i]=a[j];
				    a[j]=temp;
				}
			}
		}
		for( i=0;i<a.length;i++)
		{
		     System.out.println(a[i]);
		}
	}
}
public class SortingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter five values in array\n");
		for(int i=0;i<a.length;i++)
		{
		    a[i]=xyz.nextInt();
		}
		Sort s=new Sort();
		s.AcceptArray(a);
		s.Disply();
		

	}

}
