package test;
import java.util.*;
 class Area
{
	 float radius;
	void SetRadius(float radius)
	{
		this.radius=radius;
	}
	void CalArea()
	{
		float area=3.14f*radius*radius;
		System.out.println("Total area of circle is\n"+area);
	}
}
public class AreaApp
{
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		float r=xyz.nextFloat();
		Area a=new Area();
		a.SetRadius(r);
		a.CalArea();
	}
}
