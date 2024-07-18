package New;

public class UserDefinedApp
{
	public static void main(String[] args)
	{
		 try
		 {
		       throw new Exception("new Exception");
		 }
		 catch(Exception e)
		 {
		    System.out.println(e) ;
		 }
		class Ex extends Exception
		{
		   int a;
		   Ex(int b)
		   {
		     a=b;
		   }
		   public String toString()
		   {
		     return ("Exception Number =  "+a) ;
		   }
		}
	}
}
