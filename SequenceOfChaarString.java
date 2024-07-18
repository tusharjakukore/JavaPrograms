//Write a Java program to test if a given string contains the specified sequence of char values.
package String.com;
import java.util.*;


public class SequenceOfChaarString
{
	public static void main(String[] args)
	{
		// Create a Scanner object for user input
		Scanner xyz = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = xyz.nextLine();

        System.out.print("Enter the sequence of characters to check: ");
        String sequence = xyz.nextLine();
     // Check if the input string contains the specified sequence
        boolean containsSequence = inputString.contains(sequence);
     // Display the result based on whether the sequence is found in the string or not
        if (containsSequence)
        {
            System.out.println("The string contains the specified sequence.");
        }
        else
        {
            System.out.println("The string does not contain the specified sequence.");
        }


	}

}

/* dry run test 
 * Enter a string: Hello World
   Enter the sequence of characters to check: World
   The string contains the specified sequence.
   */
 */