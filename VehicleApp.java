/*Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). Create subclasses
Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each 
vehicle type.*/
package EncapsulationAbstraction;
//Abstract class Vehical
abstract class Vehical
{
	// Abstract methods to start and stop engine
	public abstract void startEngine();
	public abstract void stopEngine();	
}
//Car class extending Vehical
class Car extends Vehical
{
	// Implementation of starting car engine
	@Override
	public void startEngine() {
		System.out.println("car engine is started ");	
	}
	// Implementation of stopping car engine
	@Override
	public void stopEngine() {
		System.out.println(" car engine is stop");
	}
}
//Motorcycle class extending Vehical
class Motorcycle extends Vehical 
{
	@Override
	public void startEngine() {
		System.out.println(" Motorcycle engine is started");
	}
	@Override
	public void stopEngine() {
		System.out.println(" motorcycle engine is stop");
	}
}
public class VehicleApp 
{
	public static void main(String[] args) 
	{
		// Creating instances of Car and Motorcycle
		Car c=new Car();
		Motorcycle m=new Motorcycle();
		
		c.startEngine();
		c.stopEngine();
		
		m.startEngine();
		m.stopEngine();

	}

}

/*
 * Dry Run test
 * The program starts execution from the main method in VehicleApp.
A Car object c is created.
A Motorcycle object m is created.
c.startEngine() is called, which outputs "car engine is started".
c.stopEngine() is called, which outputs "car engine is stop".
m.startEngine() is called, which outputs "Motorcycle engine is started".
m.stopEngine() is called, which outputs "Motorcycle engine is stop".
 */