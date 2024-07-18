/*Write a Java program to create a base class Sports with a method called play(). Create three subclasses: Football, Basketball, and
Rugby. Override the play() method in each subclass to play a specific statement for each sport.*/

package Lab4.kk.org;
//Base class Sports with a play method
class Sports
{
    public void play() 
    {
        System.out.println("Playing  sport");
    }
}
//Football class extending Sports and overriding play method
class Football extends Sports
{
    @Override
    public void play() 
    {
        System.out.println("Playing football");
    }
}
//Basketball class extending Sports and overriding play method
class Basketball extends Sports 
{
    @Override
    public void play()
    {
        System.out.println("Playing basketball");
    }
}
//Rugby class extending Sports and overriding play method
class Rugby extends Sports 
{
    @Override
    public void play() 
    {
        System.out.println("Playing rugby");
    }
}
public class SportsApp 
{
	public static void main(String[] args) 
	{
		// Create instances of Football, Basketball, and Rugby as Sports type
		Sports football = new Football();
        Sports basketball = new Basketball();
        Sports rugby = new Rugby();

        football.play(); 
        basketball.play(); 
        rugby.play();

	}
}

/*
 * Dry Run TEst
 * 

football.play();
The play method of Football is called, outputting "Playing football".
basketball.play();
The play method of Basketball is called, outputting "Playing basketball".
rugby.play();
The play method of Rugby is called, outputting "Playing rugby".
 */