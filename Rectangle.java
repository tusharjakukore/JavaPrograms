package ClassDemo;
import java.util.*;

//Write a Java program to create a class called "Rectangle" with width and height attributes.
//Calculate the area and perimeter of the rectangle.

class AreaPeri {
    double width;
    double height;

    // Constructor
    public void Rectangle(double width, double height) 
    {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    public double calculateArea() 
    {
        return width * height;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() 
    {
        return 2 * (width + height);
    }
}


public class Rectangle 
{
	public static void main(String[] args)
	{
		// Create a rectangle object
        AreaPeri rectangle = new AreaPeri();

        // Calculate area and perimeter
        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        // Print the results
        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);

	}

}
