/*Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create two subclasses Circle and 
Cylinder. Override the draw() method in each subclass to draw the respective shape. In addition, override the calculateArea()
method in the Cylinder subclass to calculate and return the total surface area of the cylinder.*/


package Lab4.kk.org;

//Base class Shapee with methods to draw the shape and calculate the area
class Shapee {
    public void draw() 
    {
        System.out.println("Drawing  shape");
    }

    public double calculateArea() 
    {
        return 0.0;
    }
}
//Circle1 class extending Shapee with additional property radius
class Circle1 extends Shapee 
{
    protected double radius;

 // Constructor to initialize radius
    public Circle1(double radius) 
    {
        this.radius = radius;
    }

    @Override
    public void draw() 
    {
        System.out.println("Drawing Circle");
    }

    @Override
    public double calculateArea() 
    {
        return 3.14 * radius * radius;
    }
}
//Cylinder class extending Circle1 with an additional property height
class Cylinder extends Circle1
{
    private double height;

    public Cylinder(double radius, double height)
    {
        super(radius);
        this.height = height;
    }

    @Override
    public void draw() 
    {
        System.out.println("Drawing Cylinder");
    }

    @Override
    public double calculateArea()
    {
        double circleArea = super.calculateArea();
        double cylinderSurfaceArea = (2 * 3.14 * radius * height) + (2 * circleArea);
        return cylinderSurfaceArea;
    }
}

public class ShapeCylApp 
{
	public static void main(String[] args) 
	{
		// Create an instance of Circle1
		Circle1 cir = new Circle1(5);
		// Create an instance of Cylinder
        Cylinder cy = new Cylinder(3, 7);
     // Draw the circle and print its area
        cir.draw();
        System.out.println("Area of Circle: " + cir.calculateArea());
     // Draw the cylinder and print its surface area
        cy.draw();
        System.out.println("Surface Area of Cylinder: " + cy.calculateArea());

	}

}

/*
 * dry run test
 * Drawing Circle
    Area of Circle: 78.5
    Drawing Cylinder
    Surface Area of Cylinder: 188.4
 */