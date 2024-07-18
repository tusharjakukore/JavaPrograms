package test;
import java.util.*;
class Reverse
{
	int no,rem,rev=0;
	Reverse(int no)
	{
		this.no=no;
	}
	void showReverse()
	{
		while(no!=0)
		{ rem=no%10;
		  no=no/10;
		  rev=rem+rev*10;
		}
		 System.out.println("The reverse number after operation is\n"+rev);
		
	}
}

public class ConsReverseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		System.out.println("enter the number ");
		Scanner xyz=new Scanner(System.in);
		no=xyz.nextInt();
		Reverse r=new Reverse(no);
		r.showReverse();
		
	}
}
