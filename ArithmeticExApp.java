package test;
import java.util.*;

public class ArithmeticExApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter two values");
		int a=xyz.nextInt();
		int b=xyz.nextInt();
		try
		{
			System.out.println("division is"+a/b);
		}
		catch(Exception ex)
		{
			System.out.println("Exception is"+ex);
		}
		

	}

}
