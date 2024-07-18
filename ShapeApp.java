/*Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create three subclasses: Circle, Square,
and Triangle. Override the draw() method in each subclass to draw the respective shape, and override the calculateArea() method to 
calculate and return the area of each shape.*/

package Lab4.kk.org;
import java.util.*;
//Base class Shape with methods to draw the shape and calculate the area
class Shape 
{
    public void draw() 
    {
        System.out.println("Drawing  shape");
    }
    public double calculateArea() 
    {
        return 0.0;
    }
}
//Circle class extending Shape with additional property radius
class Circle extends Shape {
    private double radius;
    public Circle(double radius) 
    {
        this.radius = radius;
    }

    @Override
    public void draw() 
    {
        System.out.println("Drawing circle");
    }

    @Override
    public double calculateArea() 
    {
        return 3.14 * radius * radius;
    }
}
//Square class extending Shape with additional property side
class Square extends Shape 
{
    private double side;
    public Square(double side)
    {
        this.side = side;
    }

    @Override
    public void draw() 
    {
        System.out.println("Drawing square");
    }

    @Override
    public double calculateArea() 
    {
        return side * side;
    }
}
//Triangle class extending Shape with additional properties base and height
class Triangle extends Shape 
{
    private double base;
    private double height;

    public Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() 
    {
        System.out.println("Drawing triangle");
    }

    @Override
    public double calculateArea() 
    {
        return 0.5 * base * height;
    }
}
public class ShapeApp 
{
	public static void main(String[] args) 
	{
		// Create a scanner object for user input
		Scanner xyz = new Scanner(System.in);

        System.out.println("Enter radius of circle:");
        double radius = xyz.nextDouble();
        Circle cr = new Circle(radius);
        System.out.println("Enter side of square:");
        double side = xyz.nextDouble();
        Square sq = new Square(side);
        System.out.println("Enter base of triangle:");
        double base = xyz.nextDouble();
        System.out.println("Enter height of triangle:");
        double height = xyz.nextDouble();
        Triangle tri = new Triangle(base, height);

        cr.draw();
        System.out.println("Area of circle: " + cr.calculateArea());

        sq.draw();
        System.out.println("Area of square: " + sq.calculateArea());

        tri.draw();
        System.out.println("Area of triangle: " + tri.calculateArea());

	}
}

/*
 * Dry Run Test
 * 
 * Enter radius of circle: 5
   Enter side of square: 4
   Enter base of triangle: 3
   Enter height of triangle: 6
   
    Drawing circle
    Area of circle: 78.5
    Drawing square
    Area of square: 16.0
    Drawing triangle
    Area of triangle: 9.0
 */