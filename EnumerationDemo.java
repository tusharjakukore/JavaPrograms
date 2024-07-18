package com.demo;

enum Shape{
	Circle,
	Rectangle,
	Triangle
}
enum Month
{
	
}
enum Days
{
	
}
enum Direction
{
	North,
	South,
	East,
	West,
	
}
public class EnumerationDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        /*Direction di1=Direction.North;
        Direction di2=Direction.South;*/
        
		/*
		 * for(Direction dir : Direction.values()) { System.out.println(dir); }
		 */
		
		Direction dir=Direction.North;
		if(dir==Direction.East)
		{
			System.out.println("Direction:East");
		}
		
	}
	

}
