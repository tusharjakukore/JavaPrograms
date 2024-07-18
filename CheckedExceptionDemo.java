package kk.Exception.org;
import java.util.*;

/*Exception is events which occur at program run time and which is responsible for disturb the normal flow of application 
called as Exception.*/

/*1) Checked Exception: Those exceptions occur at program compile time called as exception. Normally in Java checked Exception is 
used for to generate the exception warning at program compile time*/



public class CheckedExceptionDemo 
{
	public static void main(String[] args)
	{
		Scanner xyz= new Scanner(System.in); 
		int a,b,c;
		System.out.println("Enter the two values");
		a=xyz.nextInt();
		b=xyz.nextInt();
		c=a/b;
		System.out.printf("Division is %d\n",c);
		System.out.println("Logic1");
		System.out.println("Logic3");

	}

}
