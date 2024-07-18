package test;
import java.util.*;
class Value
{
	int x,y;
	void SetValue(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
class Add extends Value
{
	void ShowAdd(int x,int y)
	{
		System.out.printf("Addition is %d\n",x+y);
	}
}
class Mul extends Value
{
	void ShowMul(int x,int y)
	{
		System.out.printf("Multiplication is %d\n",x*y);
		
	}
}

public class ValueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner xyz=new Scanner(System.in);
		System.out.println("Ener two values");
		int x=xyz.nextInt();
		int y=xyz.nextInt();
		System.out.println("1: Addition");
		System.out.println("2: Multiplication");
		System.out.println("Enter your choice");
		choice=xyz.nextInt();
		switch(choice)
		{
		case 1:
			Add a=new Add();
			a.ShowAdd(x,y);
		case 2:	
			Mul m=new Mul();
			m.ShowMul(x, y);
		
		}
		
	}

}
