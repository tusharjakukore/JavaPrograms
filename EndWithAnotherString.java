//Write a Java program to check whether a given string ends with another string.
package String.com;
import java.util.*;



public class EndWithAnotherString 
{
	public static void main(String[] args) 
	{
		// Create a Scanner object for user input
		Scanner xyz = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = xyz.nextLine();
        System.out.print("Enter the string to check for the ending: ");
        String endingString = xyz.nextLine();
     // Check if the main string ends with the specified ending string
        if (mainString.endsWith(endingString)) 
        {
            System.out.println("The main string ends with the specified ending string.");
        } 
        else 
        {
            System.out.println("The main string does not end with the specified ending string.");
        }


	}

}

/* Dry run test
 * Enter the main string: Hello World
  Enter the string to check for the ending: World
  The main string ends with the specified ending string. 
 */