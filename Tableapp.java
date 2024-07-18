package test;
import java.util.*;
public class Tableapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner xyz=new Scanner(System.in);
		int no=xyz.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d * %d = %d\n",no,i,no*i);
		}
         
	}

}
