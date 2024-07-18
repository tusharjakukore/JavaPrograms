/*Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). 
Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and
perimeter of each shape.*/

package EncapsulationAbstraction;

import java.util.Scanner;
//Abstract class Shapes with abstract methods for area and perimeter calculation
abstract class Shapes
{
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
}
//Circles class extending Shapes and implementing the abstract methods
class Circles extends Shapes
{
	private double radius;
	
	public Circles(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return 3.14*radius*radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2*3.14*radius;
	}
	
}
//Triangles class extending Shapes and implementing the abstract methods
class Triangles extends Shapes
{
	private double a;
	private double b;
	private double c;
	
	public Triangles(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double calculateArea() {
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s - a) * (s - b) * (s - c));
	}

	@Override
	public double calculatePerimeter() {
		return a+b+c;
	}
}

public class ShapeApplication 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        // Circle input
        System.out.println("Enter radius of circle:");
        double circleRadius = scanner.nextDouble();
        Circles c = new Circles(circleRadius);
        System.out.println("Area of circle is: " + c.calculateArea());
        System.out.println("Perimeter of Circle: " + c.calculatePerimeter());

        // Triangle input
        System.out.println("\nEnter sides of triangle:");
        System.out.print("Side a: ");
        double sideA = scanner.nextDouble();
        System.out.print("Side b: ");
        double sideB = scanner.nextDouble();
        System.out.print("Side c: ");
        double sideC = scanner.nextDouble();
        Triangles t = new Triangles(sideA, sideB, sideC);
        System.out.println("Area of Triangle is: " + t.calculateArea());
        System.out.println("Perimeter of Triangle: " + t.calculatePerimeter());

	}

}

/*
 * Dry Run Test
   Enter radius of circle: 5
   Area of circle is: 78.5
   Perimeter of Circle: 31.4

  Enter sides of triangle:
   Side a: 3
   Side b: 4
   Side c: 5
  Area of Triangle is: 6.0
  Perimeter of Triangle: 12.0
 */