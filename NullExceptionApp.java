package test;
class Test
{
	void show()
	{
		System.out.println("logic 1");
	}
}

public class NullExceptionApp {
    static Test a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			a.show();
		}
		catch(Exception ex){
			System.out.println("Exeption is"+ex);
		}
		

		

	}

}
