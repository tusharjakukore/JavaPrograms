package test;
import java.util.*;
public class ArmstrongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,result=0,rem,result1=0;
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the number\n");
		int no=xyz.nextInt();
		temp=no;
		while(no!=0)
		{
			rem=no%10;
			result=result+rem*rem*rem;
			result1=result+rem*rem*rem*rem;
			no=no/10;
		}
		if(result==temp||result1==temp)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not armtrong");
		}		
	}
}
