package New;

class Test implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
			    System.out.printf("Good Afternoon\n");
				Thread.sleep(10000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Excpetion is "+ex);
		}
	}
}
public class ShowMessageApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		Thread th=new Thread(t);
		th.start();
	}

}
